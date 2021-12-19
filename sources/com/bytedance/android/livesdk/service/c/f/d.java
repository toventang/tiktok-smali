package com.bytedance.android.livesdk.service.c.f;

import android.text.TextUtils;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.ab.i;
import com.bytedance.android.livesdk.service.c.f.a;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f21411a = new d();

    public enum a {
        ANCHOR,
        GUEST;

        static {
            Covode.recordClassIndex(12608);
        }
    }

    private d() {
    }

    static {
        Covode.recordClassIndex(12607);
    }

    public static final void a(a aVar) {
        String str;
        l.d(aVar, "");
        if (aVar == a.ANCHOR) {
            str = "host_unable_receive";
        } else {
            str = "guest_unable_receive";
        }
        b.a.a("livesdk_guest_connection_unable_gift_toast").a().a("reason", str).b();
    }

    public static final void a(int i2) {
        HashMap hashMap = new HashMap();
        if (i2 == 0) {
            hashMap.put("click_icon", "continue");
            b.a.a("livesdk_gift_age_popup_click").a((Map<String, String>) hashMap).a().c("click").b("live").d("gift_dialog").b();
        } else if (i2 != 1) {
            b.a.a("livesdk_gift_age_popup_show").a().c("show").b("live").d("gift_dialog").b();
        } else {
            hashMap.put("click_icon", "cancel");
            b.a.a("livesdk_gift_age_popup_click").a((Map<String, String>) hashMap).a().c("click").b("live").d("gift_dialog").b();
        }
    }

    public static final void a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("desc", str);
        }
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("gift_id", null);
        }
        if (!TextUtils.isEmpty(null)) {
            hashMap.put("msg_id", null);
        }
        i.b().a("ttlive_gift", hashMap);
    }

    public static final class b implements a.AbstractC0466a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f21413a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f21414b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f21415c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f21416d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f21417e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f21418f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f21419g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f21420h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ String f21421i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ boolean f21422j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f21423k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ long f21424l;

        static {
            Covode.recordClassIndex(12609);
        }

        public b(int i2, long j2, boolean z, String str, String str2, int i3, String str3, String str4, String str5, boolean z2, int i4, long j3) {
            this.f21413a = i2;
            this.f21414b = j2;
            this.f21415c = z;
            this.f21416d = str;
            this.f21417e = str2;
            this.f21418f = i3;
            this.f21419g = str3;
            this.f21420h = str4;
            this.f21421i = str5;
            this.f21422j = z2;
            this.f21423k = i4;
            this.f21424l = j3;
        }

        /* JADX WARNING: Removed duplicated region for block: B:104:0x02cd  */
        /* JADX WARNING: Removed duplicated region for block: B:107:0x02df  */
        /* JADX WARNING: Removed duplicated region for block: B:116:0x031e  */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x0325  */
        /* JADX WARNING: Removed duplicated region for block: B:120:0x0328  */
        /* JADX WARNING: Removed duplicated region for block: B:121:0x032c  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x01f2  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0263  */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x0284  */
        /* JADX WARNING: Removed duplicated region for block: B:93:0x028b  */
        @Override // com.bytedance.android.livesdk.service.c.f.a.AbstractC0466a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(java.lang.String r30, int r31, java.lang.String r32) {
            /*
            // Method dump skipped, instructions count: 938
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.service.c.f.d.b.a(java.lang.String, int, java.lang.String):void");
        }
    }
}
