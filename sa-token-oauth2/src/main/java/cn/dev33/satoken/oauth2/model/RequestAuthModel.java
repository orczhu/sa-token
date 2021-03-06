package cn.dev33.satoken.oauth2.model;

import cn.dev33.satoken.exception.SaTokenException;
import cn.dev33.satoken.util.SaTokenInsideUtil;

/**
 * 请求授权参数的Model
 * @author kong
 *
 */
public class RequestAuthModel {

	/**
	 * 应用id 
	 */
	private String clientId;
	 
	/**
	 * 授权范围
	 */
	private String scope;
	
	/**
	 * 对应的账号id 
	 */
	private Object loginId;
	
	/**
	 * 待重定向URL
	 */
	private String redirectUri; 
	
	/**
	 * 授权类型, 非必填 
	 */
	private String responseType;

	/**
	 * 状态标识, 可为null 
	 */
	private String state;

	
	/**
	 * @return clientId
	 */
	public String getClientId() {
		return clientId;
	}

	/**
	 * @param clientId 要设置的 clientId
	 */
	public RequestAuthModel setClientId(String clientId) {
		this.clientId = clientId;
		return this;
	}

	/**
	 * @return scope
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * @param scope 要设置的 scope
	 */
	public RequestAuthModel setScope(String scope) {
		this.scope = scope;
		return this;
	}

	/**
	 * @return loginId
	 */
	public Object getLoginId() {
		return loginId;
	}

	/**
	 * @param loginId 要设置的 loginId
	 */
	public RequestAuthModel setLoginId(Object loginId) {
		this.loginId = loginId;
		return this;
	}

	/**
	 * @return redirectUri
	 */
	public String getRedirectUri() {
		return redirectUri;
	}

	/**
	 * @param redirectUri 要设置的 redirectUri
	 */
	public RequestAuthModel setRedirectUri(String redirectUri) {
		this.redirectUri = redirectUri;
		return this;
	}

	/**
	 * @return responseType
	 */
	public String getResponseType() {
		return responseType;
	}

	/**
	 * @param responseType 要设置的 responseType
	 */
	public RequestAuthModel setResponseType(String responseType) {
		this.responseType = responseType;
		return this;
	}
	
	/**
	 * @return state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state 要设置的 state
	 */
	public RequestAuthModel setState(String state) {
		this.state = state;
		return this;
	}
	
	/**
	 * 检查此Model参数是否有效  
	 */
	public RequestAuthModel checkModel() {
		if(SaTokenInsideUtil.isEmpty(clientId)) {
			throw new SaTokenException("无效client_id");
		}
		if(SaTokenInsideUtil.isEmpty(scope)) {
			throw new SaTokenException("无效scope");
		}
		if(SaTokenInsideUtil.isEmpty(redirectUri)) {
			throw new SaTokenException("无效redirect_uri");
		}
		if(SaTokenInsideUtil.isEmpty(String.valueOf(loginId))) {
			throw new SaTokenException("无效LoginId");
		}
		return this;
	}
	
}
