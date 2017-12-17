const Task = require('../models/Task');
const TaskDB = require('mongoose').model('Task');

module.exports = {
	index: (req, res) => {
		TaskDB.find({}).then(all => {
			let openTasks = [];
			let inProgress = [];
			let finished = [];
			all.forEach(function (item) {
				if(item.status === 'Open') {
				    openTasks.push(item);
				}
				else if (item.status === 'In Progress') {
					inProgress.push(item);
				}
				else if (item.status === 'Finished') {
					finished.push(item);
				}
            });
			res.render('task/index', {openTasks: openTasks, inProgressTasks: inProgress, finishedTasks: finished});
		});
	},
	createGet: (req, res) => {
		res.render('task/create');
	},
	createPost: (req, res) => {
		let obj = req.body;
		TaskDB.create(obj).then(res.redirect('/'));
	},
	editGet: (req, res) => {
		let id = req.params.id;
		TaskDB.findById(id).then(obj => {
			res.render('task/edit', obj);
		});
	},
	editPost: (req, res) => {
		let obj = req.body;
		let id = req.params.id;
		TaskDB.update({_id: id}, {'title': obj.title, 'status': obj.status}).then(res.redirect('/'));
	}
};