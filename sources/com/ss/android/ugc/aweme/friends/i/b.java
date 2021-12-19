package com.ss.android.ugc.aweme.friends.i;

import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.google.i18n.phonenumbers.Phonenumber;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.friends.api.UploadContactsApi;
import com.ss.android.ugc.aweme.friends.model.ContactModel;
import com.ss.android.ugc.aweme.friends.model.ContactModelV2;
import com.ss.android.ugc.aweme.lancet.j;
import com.ss.android.ugc.aweme.social.monitor.e;
import com.ss.android.ugc.aweme.ufr.c;
import com.ss.android.ugc.aweme.utils.be;
import com.ss.android.ugc.aweme.utils.dw;
import com.ss.android.ugc.aweme.utils.ik;
import com.ss.android.ugc.aweme.utils.in;
import f.a.t;
import h.f.b.l;
import h.q;
import h.r;
import h.z;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f96872a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(61474);
    }

    private static boolean b() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean c() {
        if (j.f107226e && j.b() && !j.c()) {
            return j.f107226e;
        }
        boolean b2 = b();
        j.f107226e = b2;
        return b2;
    }

    public static final void a() {
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (g2.isLogin()) {
            d.a();
            if (c() && c.a.f141661a.c()) {
                i.b(a.f96873a, i.f4824a);
            }
        }
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final a f96873a = new a();

        static {
            Covode.recordClassIndex(61475);
        }

        a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Object obj;
            e eVar = e.f133706b;
            UUID randomUUID = UUID.randomUUID();
            l.b(randomUUID, "");
            com.ss.android.ugc.aweme.social.monitor.d a2 = eVar.a(1, randomUUID);
            a2.a();
            List<ContactModelV2> a3 = be.a(d.a(), a2, false);
            l.b(a3, "");
            if (!com.bytedance.common.utility.collection.b.a((Collection) a3)) {
                try {
                    UploadContactsApi.a(a3, a2, 1, 1);
                    a2.e();
                    obj = q.m223constructorimpl(z.f158842a);
                } catch (Throwable th) {
                    obj = q.m223constructorimpl(r.a(th));
                }
                Throwable r0 = q.m226exceptionOrNullimpl(obj);
                if (r0 != null) {
                    a2.a(r0);
                }
                a2.g();
                Keva.getRepo("friendslist_permission_keva_name").storeLong("contact_upload_next_time_key", System.currentTimeMillis() + (SettingsManager.a().a("addressbook_upload_interval", 86400L) * 1000));
            }
            return z.f158842a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.i.b$b  reason: collision with other inner class name */
    static final class C2337b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.social.monitor.d f96874a;

        static {
            Covode.recordClassIndex(61476);
        }

        C2337b(com.ss.android.ugc.aweme.social.monitor.d dVar) {
            this.f96874a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f96874a.e();
            this.f96874a.g();
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.social.monitor.d f96875a;

        static {
            Covode.recordClassIndex(61477);
        }

        c(com.ss.android.ugc.aweme.social.monitor.d dVar) {
            this.f96875a = dVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            com.ss.android.ugc.aweme.social.monitor.d dVar = this.f96875a;
            l.b(th, "");
            dVar.a(th);
            this.f96875a.g();
        }
    }

    public static final t<com.ss.android.ugc.aweme.relation.a> a(List<? extends ContactModelV2> list, com.ss.android.ugc.aweme.social.monitor.d dVar, int i2) {
        String str;
        String str2;
        l.d(list, "");
        l.d(dVar, "");
        if (in.f()) {
            t<com.ss.android.ugc.aweme.relation.a> b2 = t.b(new com.ss.android.ugc.aweme.relation.a());
            l.b(b2, "");
            return b2;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList(list.size());
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            for (ContactModelV2 contactModelV2 : list) {
                for (String str3 : contactModelV2.phoneNumber) {
                    String str4 = null;
                    if (str3 != null) {
                        Phonenumber.PhoneNumber b3 = ik.b(str3);
                        if (b3 != null) {
                            str3 = String.valueOf(b3.getNationalNumber());
                            String valueOf = String.valueOf(b3.getCountryCode());
                            Charset forName = Charset.forName("UTF-8");
                            l.b(forName, "");
                            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
                            byte[] bytes = valueOf.getBytes(forName);
                            l.b(bytes, "");
                            str4 = com.bytedance.common.utility.d.a(instance.digest(bytes));
                        }
                        Charset forName2 = Charset.forName("UTF-8");
                        l.b(forName2, "");
                        Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
                        byte[] bytes2 = str3.getBytes(forName2);
                        l.b(bytes2, "");
                        str = com.bytedance.common.utility.d.a(instance.digest(bytes2));
                        l.b(str, "");
                    } else {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(contactModelV2.name)) {
                        String str5 = contactModelV2.name;
                        l.b(str5, "");
                        Charset forName3 = Charset.forName("UTF-8");
                        l.b(forName3, "");
                        Objects.requireNonNull(str5, "null cannot be cast to non-null type java.lang.String");
                        byte[] bytes3 = str5.getBytes(forName3);
                        l.b(bytes3, "");
                        str2 = com.bytedance.common.utility.d.a(instance.digest(bytes3));
                        l.b(str2, "");
                    } else {
                        str2 = "";
                    }
                    ContactModel contactModel = new ContactModel(str, str2);
                    if (str4 != null) {
                        contactModel.regionCode = str4;
                    }
                    arrayList.add(contactModel);
                }
            }
            dVar.d();
            String b4 = dw.a().a().b().b(arrayList);
            l.b(b4, "");
            hashMap.put("contact", b4);
        }
        com.ss.android.common.applog.q.b(hashMap, true);
        t<com.ss.android.ugc.aweme.relation.a> a2 = com.ss.android.ugc.aweme.friends.api.a.a().uploadHashContacts("0", hashMap, Integer.valueOf(i2)).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new C2337b(dVar)).a(new c(dVar));
        l.b(a2, "");
        return a2;
    }
}
