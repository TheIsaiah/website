let prefix="";const url=document.currentScript.src,lastIndex=url.lastIndexOf("/");lastIndex>0&&(prefix=url.substring(0,lastIndex+1)),window.liveCapture=e=>{const t=n=>{const{message:s}=n.data;if("live-capture-canvas"!==s)return;window.removeEventListener("message",t);const r=document.createElement("script");r.src=prefix+"live-capture-sdk.js",r.onload=()=>{window.liveCaptureSdk(e,n)},document.body.appendChild(r)};window.addEventListener("message",t)};