webpackJsonp([275],{2137:function(e,t,a){"use strict";function n(e,t){if(!(e instanceof t))throw new TypeError("Cannot call a class as a function")}function i(e,t){if(!e)throw new ReferenceError("this hasn't been initialised - super() hasn't been called");return!t||"object"!=typeof t&&"function"!=typeof t?e:t}function r(e,t){if("function"!=typeof t&&null!==t)throw new TypeError("Super expression must either be null or a function, not "+typeof t);e.prototype=Object.create(t&&t.prototype,{constructor:{value:e,enumerable:!1,writable:!0,configurable:!0}}),t&&(Object.setPrototypeOf?Object.setPrototypeOf(e,t):e.__proto__=t)}Object.defineProperty(t,"__esModule",{value:!0});var o=a(0),l=a.n(o),s=a(37),c=a.n(s),m=a(4),d=(a.n(m),a(10)),u=a(9),g=a(2),p=a(116),h=function(){function e(e,t){for(var a=0;a<t.length;a++){var n=t[a];n.enumerable=n.enumerable||!1,n.configurable=!0,"value"in n&&(n.writable=!0),Object.defineProperty(e,n.key,n)}}return function(t,a,n){return a&&e(t.prototype,a),n&&e(t,n),t}}(),v=l.a.createElement("em",{className:"mandatory"},"*"),f=l.a.createElement("i",{className:"spinner spacer-right"}),b=function(e){function t(e){n(this,t);var r=i(this,(t.__proto__||Object.getPrototypeOf(t)).call(this,e));return r.closeForm=function(){r.props.router.push("/account/organizations")},r.stopProcessing=function(){r.mounted&&r.setState({loading:!1})},r.stopProcessingAndClose=function(){r.mounted&&r.setState({loading:!1}),r.closeForm()},r.handleAvatarInputChange=function(e){var t=e.target.value;r.setState({avatar:t}),r.changeAvatarImage(t)},r.changeAvatarImage=function(e){r.setState({avatarImage:e})},r.handleSubmit=function(e){e.preventDefault();var t={name:r.state.name};r.state.avatar&&Object.assign(t,{avatar:r.state.avatar}),r.state.description&&Object.assign(t,{description:r.state.description}),r.state.key&&Object.assign(t,{key:r.state.key}),r.state.url&&Object.assign(t,{url:r.state.url}),r.setState({loading:!0}),r.props.createOrganization(t).then(r.stopProcessingAndClose,r.stopProcessing)},r.state={loading:!1,avatar:"",avatarImage:"",description:"",key:"",name:"",url:""},r.changeAvatarImage=a.i(m.debounce)(r.changeAvatarImage,500),r}return r(t,e),h(t,[{key:"componentDidMount",value:function(){this.mounted=!0}},{key:"componentWillUnmount",value:function(){this.mounted=!1}},{key:"render",value:function(){var e=this;return l.a.createElement(c.a,{isOpen:!0,contentLabel:"modal form",className:"modal",overlayClassName:"modal-overlay",onRequestClose:this.closeForm},l.a.createElement("header",{className:"modal-head"},l.a.createElement("h2",null,a.i(g.translate)("my_account.create_organization"))),l.a.createElement("form",{onSubmit:this.handleSubmit},l.a.createElement("div",{className:"modal-body"},l.a.createElement("div",{className:"modal-field"},l.a.createElement("label",{htmlFor:"organization-name"},a.i(g.translate)("organization.name"),v),l.a.createElement("input",{id:"organization-name",autoFocus:!0,name:"name",required:!0,type:"text",minLength:"2",maxLength:"64",value:this.state.name,disabled:this.state.loading,onChange:function(t){return e.setState({name:t.target.value})}}),l.a.createElement("div",{className:"modal-field-description"},a.i(g.translate)("organization.name.description"))),l.a.createElement("div",{className:"modal-field"},l.a.createElement("label",{htmlFor:"organization-key"},a.i(g.translate)("organization.key")),l.a.createElement("input",{id:"organization-key",name:"key",type:"text",minLength:"2",maxLength:"64",value:this.state.key,disabled:this.state.loading,onChange:function(t){return e.setState({key:t.target.value})}}),l.a.createElement("div",{className:"modal-field-description"},a.i(g.translate)("organization.key.description"))),l.a.createElement("div",{className:"modal-field"},l.a.createElement("label",{htmlFor:"organization-avatar"},a.i(g.translate)("organization.avatar")),l.a.createElement("input",{id:"organization-avatar",name:"avatar",type:"text",maxLength:"256",value:this.state.avatar,disabled:this.state.loading,onChange:this.handleAvatarInputChange}),l.a.createElement("div",{className:"modal-field-description"},a.i(g.translate)("organization.avatar.description")),!!this.state.avatarImage&&l.a.createElement("div",{className:"spacer-top spacer-bottom"},l.a.createElement("div",{className:"little-spacer-bottom"},a.i(g.translate)("organization.avatar.preview"),":"),l.a.createElement("img",{src:this.state.avatarImage,alt:"",height:30}))),l.a.createElement("div",{className:"modal-field"},l.a.createElement("label",{htmlFor:"organization-description"},a.i(g.translate)("description")),l.a.createElement("textarea",{id:"organization-description",name:"description",rows:"3",maxLength:"256",value:this.state.description,disabled:this.state.loading,onChange:function(t){return e.setState({description:t.target.value})}}),l.a.createElement("div",{className:"modal-field-description"},a.i(g.translate)("organization.description.description"))),l.a.createElement("div",{className:"modal-field"},l.a.createElement("label",{htmlFor:"organization-url"},a.i(g.translate)("organization.url")),l.a.createElement("input",{id:"organization-url",name:"url",type:"text",maxLength:"256",value:this.state.url,disabled:this.state.loading,onChange:function(t){return e.setState({url:t.target.value})}}),l.a.createElement("div",{className:"modal-field-description"},a.i(g.translate)("organization.url.description")))),l.a.createElement("footer",{className:"modal-foot"},l.a.createElement("div",null,this.state.loading&&f,l.a.createElement("button",{disabled:this.state.loading,type:"submit"},a.i(g.translate)("create")),l.a.createElement("button",{type:"reset",className:"button-link",onClick:this.closeForm},a.i(g.translate)("cancel"))))))}}]),t}(l.a.PureComponent),y={createOrganization:p.j};t.default=a.i(d.connect)(null,y)(a.i(u.withRouter)(b))}});
//# sourceMappingURL=275.75c85906.chunk.js.map