const Report = require('../models/Report');
const ReportDB = require('mongoose').model('Report');

module.exports = {
    index: (req, res) => {
        ReportDB.find({}).then(all => {
          res.render('report/index', {reports: all});
        });
    },
    createGet: (req, res) => {
        res.render('report/create');
    },
    createPost: (req, res) => {
        let obj = req.body;
        ReportDB.create(obj).then(res.redirect('/'));
    },
    detailsGet: (req, res) => {
        let id = req.params.id;
        ReportDB.findById(id).then(obj => {
            res.render('report/details', obj);
        });
    },
    deleteGet: (req, res) => {
        let id = req.params.id;
        ReportDB.findById(id).then(obj => {
            res.render('report/delete', obj);
        });
    },
    deletePost: (req, res) => {
        let id = req.params.id;
        ReportDB.remove({_id: id}).then(res.redirect('/'));
    }
};