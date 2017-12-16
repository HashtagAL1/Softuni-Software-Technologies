using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Linq;
using System.Web;

namespace TODOlist.Models
{
    public class Task
    {
        public int id { get; set; }

        [Required]
        public string title { get; set; }
    }
}