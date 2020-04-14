let vm = new Vue({
    el: "#app",
    data: {
        colList:"",
        newsList:""
    },
    methods: {
        getNews(colId) {
            let url = "http://localhost:9090/news/list/" + colId;
            let _this=this;
            axios.get(url).then(
                function (res) {//请求成功
                    _this.newsList=res.data;
                    console.log(_this.newsList);
                },
                function (err) {//请求失败
                    console.log(err);
                });
        },
        getColumn(){
            let url = "http://localhost:9090/col/list";
            let _this=this;
            axios.get(url).then(
                function (res) {//请求成功
                    _this.colList=res.data;
                    console.log(_this.colList);
                },
                function (err) {//请求失败
                    console.log("请求失败："+err);
                });
        }
    },
    mounted:function () {
        this.getColumn();
        this.getNews(1);
    }
});