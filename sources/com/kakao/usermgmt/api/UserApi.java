package com.kakao.usermgmt.api;

import com.bytedance.covode.number.Covode;
import com.kakao.auth.AuthService;
import com.kakao.auth.network.AuthNetworkService;
import com.kakao.usermgmt.request.AgeAuthRequest;
import com.kakao.usermgmt.request.LogoutRequest;
import com.kakao.usermgmt.request.MeV2Request;
import com.kakao.usermgmt.request.ServiceTermsRequest;
import com.kakao.usermgmt.request.ShippingAddressesRequest;
import com.kakao.usermgmt.request.SignupRequest;
import com.kakao.usermgmt.request.UnlinkRequest;
import com.kakao.usermgmt.request.UpdateProfileRequest;
import com.kakao.usermgmt.response.AgeAuthResponse;
import com.kakao.usermgmt.response.MeV2Response;
import com.kakao.usermgmt.response.ServiceTermsResponse;
import com.kakao.usermgmt.response.ShippingAddressResponse;
import com.kakao.usermgmt.response.UserResponse;
import java.util.List;
import java.util.Map;

public class UserApi {
    private static UserApi instance = new UserApi(AuthNetworkService.Factory.getInstance());
    private AuthNetworkService networkService;

    public static UserApi getInstance() {
        return instance;
    }

    public Long requestLogout() {
        return (Long) this.networkService.request(new LogoutRequest(), UserResponse.CONVERTER);
    }

    public Long requestUnlink() {
        return (Long) this.networkService.request(new UnlinkRequest(), UserResponse.CONVERTER);
    }

    public ServiceTermsResponse serviceTerms() {
        return (ServiceTermsResponse) this.networkService.request(new ServiceTermsRequest(), ServiceTermsResponse.CONVERTER);
    }

    static {
        Covode.recordClassIndex(34429);
    }

    UserApi(AuthNetworkService authNetworkService) {
        this.networkService = authNetworkService;
    }

    public Long requestSignup(Map<String, String> map) {
        return (Long) this.networkService.request(new SignupRequest(map), UserResponse.CONVERTER);
    }

    public Long requestUpdateProfile(Map<String, String> map) {
        return (Long) this.networkService.request(new UpdateProfileRequest(map), UserResponse.CONVERTER);
    }

    public MeV2Response me(List<String> list, Boolean bool) {
        return (MeV2Response) this.networkService.request(new MeV2Request(list, bool.booleanValue()), MeV2Response.CONVERTER);
    }

    public AgeAuthResponse requestAgeAuthInfo(AuthService.AgeLimit ageLimit, List<String> list) {
        String str;
        if (ageLimit != null) {
            str = ageLimit.getValue();
        } else {
            str = null;
        }
        return (AgeAuthResponse) this.networkService.request(new AgeAuthRequest(str, list), AgeAuthResponse.CONVERTER);
    }

    public ShippingAddressResponse shippingAddresses(Long l2, Integer num, Integer num2) {
        return (ShippingAddressResponse) this.networkService.request(new ShippingAddressesRequest(l2, num, num2), ShippingAddressResponse.CONVERTER);
    }
}
