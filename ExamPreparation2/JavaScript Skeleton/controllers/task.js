const Task = require('../models/Task');
const TaskDB = require('mongoose').model('Task');

module.exports = {
    index: (req, res) => {
    	TaskDB.find({}).then(tasks => {
    		res.render('task/index', {tasks: tasks});
		});
    },
	createGet: (req, res) => {
    	res.render('task/create');
	},
	createPost: (req, res) => {
    	let obj = req.body;
    	TaskDB.create(obj).then(res.redirect('/'));
	},
	deleteGet: (req, res) => {
    	let id = req.params.id;
    	TaskDB.findById(id).then(obj => {
    		res.render('task/delete', obj);
		});
	},
	deletePost: (req, res) => {
    	let id = req.params.id;
    	TaskDB.remove({_id : id}).then(res.redirect('/'));
	}
};