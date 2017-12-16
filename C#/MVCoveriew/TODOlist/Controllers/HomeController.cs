using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using TODOlist.Models;

namespace TODOlist.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index()
        {
            using (var db = new TaskDBContext())
            {
                var tasks = db.Tasks.ToList();

                return View(tasks);
            }
        }
    }
}