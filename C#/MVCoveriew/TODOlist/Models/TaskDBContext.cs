namespace TODOlist.Models
{
    using System;
    using System.Data.Entity;
    using System.Linq;

    public class TaskDBContext : DbContext
    {
        public TaskDBContext()
            : base("name=TaskDBContext")
        {
        }

        public virtual DbSet<Task> Tasks { get; set; }
    }
}