package com.ss.android.ugc.aweme.friends.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.t;
import com.bytedance.retrofit2.b.z;
import com.google.i18n.phonenumbers.Phonenumber;
import com.ss.android.common.applog.q;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.friends.model.ContactModel;
import com.ss.android.ugc.aweme.friends.model.ContactModelV2;
import com.ss.android.ugc.aweme.friends.model.UploadContactsResult;
import com.ss.android.ugc.aweme.friends.service.a;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.social.monitor.d;
import com.ss.android.ugc.aweme.utils.dw;
import com.ss.android.ugc.aweme.utils.ik;
import com.ss.android.ugc.aweme.utils.in;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class UploadContactsApi {

    /* renamed from: a  reason: collision with root package name */
    private static final UploadContactsService f96819a = ((UploadContactsService) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(Api.f66569d).create(UploadContactsService.class));

    public interface UploadContactsService {
        static {
            Covode.recordClassIndex(61429);
        }

        @t(a = "/aweme/v1/upload/contacts/")
        @g
        b<String> uploadContacts(@z(a = "need_unregistered_user") String str, @f Map<String, String> map);

        @t(a = "/aweme/v1/upload/hashcontacts/")
        @g
        b<UploadContactsResult> uploadHashContacts(@z(a = "need_unregistered_user") String str, @f Map<String, String> map, @z(a = "scene") Integer num);
    }

    static {
        Covode.recordClassIndex(61428);
    }

    public static UploadContactsResult a(List<ContactModelV2> list, d dVar, int i2, int i3) {
        String str;
        String str2;
        if (in.f() || !a.f97047a.e()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            ArrayList arrayList = new ArrayList(list.size());
            for (ContactModelV2 contactModelV2 : list) {
                for (String str3 : contactModelV2.phoneNumber) {
                    String str4 = "";
                    if (str3 != null) {
                        Phonenumber.PhoneNumber b2 = ik.b(str3);
                        if (b2 != null) {
                            str3 = String.valueOf(b2.getNationalNumber());
                            b2.getCountryCode();
                            b2.getNationalNumber();
                            str = com.bytedance.common.utility.d.a(instance.digest(String.valueOf(b2.getCountryCode()).getBytes("UTF-8")));
                        } else {
                            str = null;
                        }
                        str2 = com.bytedance.common.utility.d.a(instance.digest(str3.getBytes("UTF-8")));
                    } else {
                        str = null;
                        str2 = str4;
                    }
                    if (!TextUtils.isEmpty(contactModelV2.name)) {
                        str4 = com.bytedance.common.utility.d.a(instance.digest(contactModelV2.name.getBytes("UTF-8")));
                    }
                    ContactModel contactModel = new ContactModel(str2, str4);
                    if (str != null) {
                        contactModel.regionCode = str;
                    }
                    arrayList.add(contactModel);
                }
            }
            if (dVar != null) {
                dVar.d();
            }
            hashMap.put("contact", dw.a().a().b().b(arrayList));
        }
        q.b(hashMap, true);
        return f96819a.uploadHashContacts(String.valueOf(i2), hashMap, Integer.valueOf(i3)).execute().f42630b;
    }
}
