﻿using System;
using System.Linq;
using System.Web.Mvc;
using TeisterMask.Models;
using System.Data.Entity;

namespace TeisterMask.Controllers
{
        [ValidateInput(false)]
	public class TaskController : Controller
	{
	    [HttpGet]
            [Route("")]
	    public ActionResult Index()
	    {
            using (var db = new TeisterMaskDbContext())
            {
                var tasks = db.Tasks.ToList();
                return View(tasks);
            }
		}

        [HttpGet]
        [Route("create")]
        public ActionResult Create()
		{
            return View();
		}

		[HttpPost]
		[Route("create")]
        [ValidateAntiForgeryToken]
		public ActionResult Create(Task task)
		{
            using (var db = new TeisterMaskDbContext())
            {
                db.Tasks.Add(task);
                db.SaveChanges();
                return RedirectToAction("Index");
            }
        }

		[HttpGet]
		[Route("edit/{id}")]
        public ActionResult Edit(int id)
		{
            using (var db = new TeisterMaskDbContext())
            {                
                var task = db.Tasks.Find(id);
                return View(task);
            }
        }

		[HttpPost]
		[Route("edit/{id}")]
        [ValidateAntiForgeryToken]
		public ActionResult EditConfirm(int id, Task taskModel)
		{
            using (var db = new TeisterMaskDbContext())
            {
                var task = db.Tasks.Find(id);
                task.Status = taskModel.Status;
                task.Title = taskModel.Title;
                db.SaveChanges();

                return RedirectToAction("Index");
            }
		}
	}
}