webpackJsonp([1],{LW6w:function(t,e){},NHnr:function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var n=a("7+uW"),r=a("zL8q"),s=a.n(r),o=(a("tvR6"),a("mtWM")),i=a.n(o),l=a("DWlv"),c=a.n(l),u={render:function(){var t=this.$createElement,e=this._self._c||t;return e("div",{attrs:{id:"app"}},[e("router-view")],1)},staticRenderFns:[]};var h=a("VU/8")({name:"App"},u,!1,function(t){a("bK4I")},null,null).exports,p=a("/ocq"),g={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"hello"},[a("el-button",[t._v("默认按钮")]),t._v(" "),a("h1",[t._v(t._s(t.msg))]),t._v(" "),a("h2",[t._v("Essential Links")]),t._v(" "),t._m(0),t._v(" "),a("h2",[t._v("Ecosystem")]),t._v(" "),t._m(1)],1)},staticRenderFns:[function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("ul",[a("li",[a("a",{attrs:{href:"https://vuejs.org",target:"_blank"}},[t._v("\n        Core Docs\n      ")])]),t._v(" "),a("li",[a("a",{attrs:{href:"https://forum.vuejs.org",target:"_blank"}},[t._v("\n        Forum\n      ")])]),t._v(" "),a("li",[a("a",{attrs:{href:"https://chat.vuejs.org",target:"_blank"}},[t._v("\n        Community Chat\n      ")])]),t._v(" "),a("li",[a("a",{attrs:{href:"https://twitter.com/vuejs",target:"_blank"}},[t._v("\n        Twitter\n      ")])]),t._v(" "),a("br"),t._v(" "),a("li",[a("a",{attrs:{href:"http://vuejs-templates.github.io/webpack/",target:"_blank"}},[t._v("\n        Docs for This Template\n      ")])])])},function(){var t=this.$createElement,e=this._self._c||t;return e("ul",[e("li",[e("a",{attrs:{href:"http://router.vuejs.org/",target:"_blank"}},[this._v("\n        vue-router\n      ")])]),this._v(" "),e("li",[e("a",{attrs:{href:"http://vuex.vuejs.org/",target:"_blank"}},[this._v("\n        vuex\n      ")])]),this._v(" "),e("li",[e("a",{attrs:{href:"http://vue-loader.vuejs.org/",target:"_blank"}},[this._v("\n        vue-loader\n      ")])]),this._v(" "),e("li",[e("a",{attrs:{href:"https://github.com/vuejs/awesome-vue",target:"_blank"}},[this._v("\n        awesome-vue\n      ")])])])}]};var v=a("VU/8")({name:"HelloWorld",data:function(){return{msg:"Welcome to Your Vue.js App"}}},g,!1,function(t){a("LW6w")},"data-v-6b9da7e0",null).exports,f=a("Xxa5"),m=a.n(f),d=a("exGp"),_=a.n(d),b=a("//Fk"),w=a.n(b),y=a("mw3O"),C=a.n(y),k="http://localhost:8081/api/",x=1e4;function z(t){return!t||200!==t.status&&304!==t.status&&400!==t.status?{status:-404,msg:"网络异常"}:t.data}function W(t){return-404===t.status&&alert(t.msg),t}i.a.interceptors.request.use(function(t){return t},function(t){return w.a.reject(t)}),i.a.interceptors.response.use(function(t){return t},function(t){return w.a.resolve(t.response)});var j={post:function(t,e){var a=this;return _()(m.a.mark(function n(){return m.a.wrap(function(a){for(;;)switch(a.prev=a.next){case 0:return a.abrupt("return",i()({method:"post",baseURL:k,url:t,data:C.a.stringify(e),timeout:x,headers:{"X-Requested-With":"XMLHttpRequest","Content-Type":"application/x-www-form-urlencoded; charset=UTF-8"}}).then(function(t){return z(t)}).then(function(t){return W(t)}));case 1:case"end":return a.stop()}},n,a)}))()},get:function(t,e){var a=this;return _()(m.a.mark(function n(){return m.a.wrap(function(a){for(;;)switch(a.prev=a.next){case 0:return a.abrupt("return",i()({method:"get",baseURL:k,url:t,params:e,timeout:x,headers:{"X-Requested-With":"XMLHttpRequest"}}).then(function(t){return z(t)}).then(function(t){return W(t)}));case 1:case"end":return a.stop()}},n,a)}))()}},P={data:function(){return{movies:[],src:"http://img3.cache.netease.com/photo/0003/2012-06-23/84MTU7FH51HH0003.jpg"}},mounted:function(){var t,e,a=this;(t=11,e=20,j.get("doubans",{page:t,size:e})).then(function(t){a.movies=t._embedded.doubans,console.log(t)})}},E={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("el-container",[a("el-main",{attrs:{height:""}},[a("el-row",{staticClass:"main-row",attrs:{gutter:20}},[t._l(t.movies,function(e){return a("el-col",{key:e,staticClass:"main-col",attrs:{span:4,offset:0}},[a("el-image",{attrs:{src:t.src,fit:t.none,lazy:""}},[a("div",{staticClass:"image-slot",attrs:{slot:"placeholder"},slot:"placeholder"},[t._v("\n            加载中"),a("span",{staticClass:"dot"},[t._v("...")])]),t._v(" "),a("div",{staticClass:"image-slot",attrs:{slot:"error"},slot:"error"},[a("i",{staticClass:"el-icon-picture-outline"})])]),t._v(" "),a("div",[t._v("\n        "+t._s(e.name)+"\n      ")])],1)}),t._v(" "),a("el-col",{attrs:{span:12,offset:0}},[t._v("1")])],2)],1)],1)},staticRenderFns:[]};var R=a("VU/8")(P,E,!1,function(t){a("rZQs")},"data-v-60e5d48b",null).exports,D=a("mvHQ"),S=a.n(D),F={data:function(){return{wallpapers:[],imgurl:"https://th.wallhaven.cc/small/",totalElements:0,size:24,currentPage:1,purity:"SFW,Sketchy",categoryCheck:["普通","动漫","人物"],categories:["普通","动漫","人物"],category:["General","Anime","People"],categoryDict:{"普通":"General","动漫":"Anime","人物":"People"}}},methods:{typeChange:function(){var t=this;this.category.length=0,this.categoryCheck.forEach(function(e){t.category.push(t.categoryDict[e])}),this.currentPage=1,this.setContextData("currentPage",this.currentPage),this.loadWallpaper()},handleSizeChange:function(t){console.log("每页 "+t+" 条"),this.size=t,this.loadWallpaper()},handleCurrentChange:function(t){console.log("当前页: "+t),this.currentPage=t,this.setContextData("currentPage",this.currentPage),this.loadWallpaper()},loadWallpaper:function(){var t,e,a,n,r=this;(t=this.purity,e=this.category.join(","),a=this.currentPage-1,n=this.size,j.get("wallpapers/search/type",{purity:t,category:e,page:a,size:n})).then(function(t){r.wallpapers=t._embedded.wallpapers,r.totalElements=t.page.totalElements,window.scroll(0,0),console.log(t)})},setContextData:function(t,e){"string"==typeof e?sessionStorage.setItem(t,e):sessionStorage.setItem(t,S()(e))},getContextData:function(t){var e=sessionStorage.getItem(t);if("string"==typeof e)try{return JSON.parse(e)}catch(t){return e}}},mounted:function(){this.loadWallpaper()},created:function(){console.log("created..."),this.currentPage=this.getContextData("currentPage"),console.log("created..."+this.currentPage)}},H={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("el-container",[a("el-header",{attrs:{height:"100px"}},[a("div",[a("el-checkbox-group",{on:{change:t.typeChange},model:{value:t.categoryCheck,callback:function(e){t.categoryCheck=e},expression:"categoryCheck"}},t._l(t.categories,function(e){return a("el-checkbox-button",{key:e,attrs:{label:e}},[t._v(t._s(e))])}),1)],1)]),t._v(" "),a("el-main",{attrs:{height:""}},[a("el-row",{staticClass:"main-row",attrs:{gutter:20}},t._l(t.wallpapers,function(e,n){return a("el-col",{key:n,staticClass:"main-col",attrs:{lg:6,xl:4,xs:12,sm:12,md:8,offset:0}},[a("div",{staticClass:"block block-div"},[a("el-image",{staticClass:"wallpaper-img",attrs:{"preview-src-list":[e.imgUrl],src:t.imgurl+e.imgKey.substring(0,2)+"/"+e.imgKey+".jpg",lazy:""}}),t._v(" "),a("div",{staticClass:"msg-div"},[a("div",{staticClass:"size-div",attrs:{onselectstart:"return false;"}},[t._v("\n              "+t._s(e.imgSize)+" - "+t._s(e.storageSize)+"\n            ")])])],1)])}),1),t._v(" "),0!=t.totalElements?a("el-pagination",{attrs:{"page-size":24,"page-sizes":[24,48,72,96,120],background:"","current-page":t.currentPage,"pager-count":11,layout:"total, sizes, prev, pager, next, jumper",total:t.totalElements},on:{"size-change":t.handleSizeChange,"current-change":t.handleCurrentChange}}):t._e()],1)],1)},staticRenderFns:[]};var U=a("VU/8")(F,H,!1,function(t){a("W+gr")},"data-v-b581b09a",null).exports;n.default.use(p.a);var L=new p.a({routes:[{path:"/",name:"helloword",component:v},{path:"/wallpaper",component:U},{path:"/movie",name:"movie",component:R}]});n.default.config.productionTip=!1,n.default.use(c.a,i.a),n.default.use(s.a),new n.default({el:"#app",router:L,components:{App:h},template:"<App/>"})},"W+gr":function(t,e){},bK4I:function(t,e){},rZQs:function(t,e){},tvR6:function(t,e){}},["NHnr"]);
//# sourceMappingURL=app.5d04745d6b02e08246e2.js.map