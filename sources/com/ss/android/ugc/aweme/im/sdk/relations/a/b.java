package com.ss.android.ugc.aweme.im.sdk.relations.a;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.sharer.ui.SharePackage;
import h.f.a.m;
import h.f.b.j;
import h.f.b.l;
import h.z;
import java.util.Map;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f102960a = new b();

    private b() {
    }

    static {
        Covode.recordClassIndex(65998);
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class a extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f102961a = new a();

        static {
            Covode.recordClassIndex(65999);
        }

        a() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.a.b$b  reason: collision with other inner class name */
    public static final /* synthetic */ class C2605b extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2605b f102962a = new C2605b();

        static {
            Covode.recordClassIndex(66000);
        }

        C2605b() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    public static final /* synthetic */ class c extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f102963a = new c();

        static {
            Covode.recordClassIndex(66001);
        }

        c() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final /* synthetic */ class d extends j implements m<String, Map<String, String>, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f102964a = new d();

        static {
            Covode.recordClassIndex(66002);
        }

        d() {
            super(2, r.class, "onEventV3", "onEventV3(Ljava/lang/String;Ljava/util/Map;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(String str, Map<String, String> map) {
            r.a(str, map);
            return z.f158842a;
        }
    }

    public static /* synthetic */ void a(SharePackage sharePackage, String str, long j2) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        Bundle bundle4;
        Bundle bundle5;
        long currentTimeMillis = System.currentTimeMillis();
        C2605b bVar = C2605b.f102962a;
        l.d(str, "");
        l.d(bVar, "");
        String str7 = null;
        if (sharePackage == null || (bundle5 = sharePackage.f124595i) == null) {
            str2 = null;
        } else {
            str2 = bundle5.getString("enter_method");
        }
        if ((!l.a((Object) "long_press", (Object) str2)) && (!l.a((Object) "long_press_more", (Object) str2))) {
            str2 = "more_button";
        }
        String str8 = "chat";
        if (sharePackage == null || (bundle4 = sharePackage.f124595i) == null) {
            str3 = null;
        } else {
            str3 = bundle4.getString("platform", str8);
        }
        if (!TextUtils.equals(str3, "chat_list")) {
            str8 = str3;
        }
        String a2 = a.a("share_video_success", currentTimeMillis);
        com.ss.android.ugc.aweme.app.f.d a3 = new com.ss.android.ugc.aweme.app.f.d().a("platform", str8);
        if (sharePackage == null || (bundle3 = sharePackage.f124595i) == null) {
            str4 = null;
        } else {
            str4 = bundle3.getString("aid");
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("group_id", str4);
        if (sharePackage == null || (bundle2 = sharePackage.f124595i) == null) {
            str5 = null;
        } else {
            str5 = bundle2.getString("author_id");
        }
        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("author_id", str5);
        if (!(sharePackage == null || (bundle = sharePackage.f124595i) == null)) {
            str7 = bundle.getString("enter_from");
        }
        com.ss.android.ugc.aweme.app.f.d a6 = a5.a("enter_from", str7);
        if (j2 > 0) {
            str6 = "private";
        } else {
            str6 = "group";
        }
        Map<String, String> map = a6.a("chat_type", str6).a("enter_method", str2).a("bind_id", a2).f66730a;
        l.b(map, "");
        bVar.invoke("share_video_success", map);
        androidx.c.a aVar = new androidx.c.a();
        aVar.put("bind_id", a2);
        aVar.put("conversation_id", str);
        if (j2 > 0) {
            aVar.put("to_user_id", String.valueOf(j2));
        }
        bVar.invoke("share_video_success_info", aVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0158, code lost:
        if (r10 != null) goto L_0x015a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0168, code lost:
        if (r0 == null) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x016a, code lost:
        r0 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x016b, code lost:
        com.ss.android.ugc.aweme.upvote.event.c.a(r9, r1, r8, r0);
        r0 = r9.f66730a;
        h.f.b.l.b(r0, "");
        r3.invoke("share_video_to_chat", r0);
        r5 = new com.ss.android.ugc.aweme.app.f.d();
        r5.a("bind_id", r14);
        r5.a("conversation_id", "");
        r5.a("to_user_id", r11.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x018e, code lost:
        if (android.text.TextUtils.isEmpty(r2) != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0190, code lost:
        r0 = new com.ss.android.ugc.aweme.profile.model.User();
        r0.setSocialInfo(r2);
        com.ss.android.ugc.aweme.utils.eu.a(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019b, code lost:
        r1 = r5.f66730a;
        h.f.b.l.b(r1, "");
        r3.invoke("share_video_to_chat_info", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void a(com.ss.android.ugc.aweme.sharer.ui.SharePackage r13, java.lang.String r14, java.util.List r15) {
        /*
        // Method dump skipped, instructions count: 447
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.relations.a.b.a(com.ss.android.ugc.aweme.sharer.ui.SharePackage, java.lang.String, java.util.List):void");
    }

    public static /* synthetic */ void a(SharePackage sharePackage, String str, long j2, boolean z, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        a aVar = a.f102961a;
        l.d(str, "");
        l.d(aVar, "");
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("platform", "chat");
        String str7 = null;
        if (sharePackage == null || (bundle3 = sharePackage.f124595i) == null) {
            str3 = null;
        } else {
            str3 = bundle3.getString("aid");
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("group_id", str3);
        if (sharePackage == null || (bundle2 = sharePackage.f124595i) == null) {
            str4 = null;
        } else {
            str4 = bundle2.getString("author_id");
        }
        com.ss.android.ugc.aweme.app.f.d a4 = a3.a("author_id", str4);
        if (!(sharePackage == null || (bundle = sharePackage.f124595i) == null)) {
            str7 = bundle.getString("enter_from");
        }
        com.ss.android.ugc.aweme.app.f.d a5 = a4.a("enter_from", str7).a("conversation_id", str);
        if (j2 > 0) {
            a5.a("to_user_id", j2);
        }
        if (j2 > 0) {
            str5 = "private";
        } else {
            str5 = "group";
        }
        com.ss.android.ugc.aweme.app.f.d a6 = a5.a("chat_type", str5).a("enter_method", "more_button");
        if (z) {
            str6 = "1";
        } else {
            str6 = "0";
        }
        Map<String, String> map = a6.a("status", str6).a("error_code", str2).f66730a;
        l.b(map, "");
        aVar.invoke("share_video_response", map);
    }
}
