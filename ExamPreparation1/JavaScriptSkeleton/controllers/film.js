const Film = require('../models/Film');
const FilmSchema = require('mongoose').model('Film');

module.exports = {
	index: (req, res) => {
		FilmSchema.find({}).then(films => {
			res.render('film/index', {films: films});
		});
	},
	createGet: (req, res) => {
		res.render('film/create');
	},
	createPost: (req, res) => {
		let obj = req.body;
		FilmSchema.create(obj).then(res.redirect('/'));
	},
	editGet: (req, res) => {
		let id = req.params.id;
		FilmSchema.findById(id).then(film => {
			res.render('film/edit', film);
		})
	},
	editPost: (req, res) => {
		let id = req.params.id;
		let obj = req.body;
		FilmSchema.update({_id: id}, {'name':obj.name, 'director':obj.director,
		 'year':obj.year, 'genre':obj.genre}).then(res.redirect('/'));
	},
	deleteGet: (req, res) => {
		let id = req.params.id;
		FilmSchema.findById(id).then(film => {
			res.render('film/delete', film);
		})
	},
	deletePost: (req, res) => {
		let id = req.params.id;
		FilmSchema.remove({_id: id}).then(res.redirect('/'));
	}
};