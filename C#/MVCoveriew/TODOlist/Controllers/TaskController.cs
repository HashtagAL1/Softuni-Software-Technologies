using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using TODOlist.Models;

namespace TODOlist.Controllers
{
    public class TaskController : Controller
    {
        [HttpPost]
        public ActionResult Create(Task task)
        {
            if (task == null)
            {
                return RedirectToAction("Index", "Home");
            }
            using (var db = new TaskDBContext())
            {
                db.Tasks.Add(task);
                db.SaveChanges();
            }

            return RedirectToAction("Index", "Home");
        }

        [HttpGet]
        public ActionResult Delete(int? id)
        {
            if (id == null)
            {
                return RedirectToAction("Index", "Home");
            }

            using (var db = new TaskDBContext())
            {
                var task = db.Tasks.Find(id);

                if (task == null)
                {
                    return RedirectToAction("Index", "Home");
                }
                db.Tasks.Remove(task);
                db.SaveChanges();
            }
            return RedirectToAction("Index", "Home");
        }
    }
}