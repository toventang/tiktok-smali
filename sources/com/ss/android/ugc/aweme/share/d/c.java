package com.ss.android.ugc.aweme.share.d;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.base.livedata.a;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.ShareDependService;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f123449a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f123450b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f123451c;

    /* renamed from: d  reason: collision with root package name */
    public static Aweme f123452d;

    /* renamed from: e  reason: collision with root package name */
    public static Aweme f123453e;

    /* renamed from: f  reason: collision with root package name */
    public static String f123454f;

    /* renamed from: g  reason: collision with root package name */
    public static String f123455g;

    /* renamed from: h  reason: collision with root package name */
    public static int f123456h;

    /* renamed from: i  reason: collision with root package name */
    static String f123457i = "";

    /* renamed from: j  reason: collision with root package name */
    public static int f123458j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final c f123459k = new c();

    /* renamed from: l  reason: collision with root package name */
    private static final ArrayList<String> f123460l;

    /* renamed from: m  reason: collision with root package name */
    private static final List<String> f123461m = n.b("download", "download_no_watermark");

    private c() {
    }

    public static final boolean b() {
        if (f123449a || f123450b) {
            return true;
        }
        return false;
    }

    public static final boolean c() {
        return ShareDependService.a.a().b();
    }

    public static final boolean d() {
        Activity j2 = f.j();
        if (j2 == null) {
            return false;
        }
        return f123460l.contains(j2.getLocalClassName());
    }

    static {
        Covode.recordClassIndex(81059);
        ArrayList<String> arrayList = new ArrayList<>();
        f123460l = arrayList;
        arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
    }

    public static boolean a() {
        Aweme aweme = f123453e;
        if (aweme == null || f123452d == null) {
            return false;
        }
        String aid = aweme.getAid();
        Aweme aweme2 = f123452d;
        if (aweme2 == null) {
            l.b();
        }
        return l.a((Object) aid, (Object) aweme2.getAid());
    }

    public static void a(String str) {
        l.d(str, "");
        f123457i = str;
    }

    public static void a(a aVar) {
        l.d(aVar, "");
        if (b("download")) {
            a.C1541a.f68149a.a("video_download_status").postValue(aVar);
        }
    }

    public static final boolean b(String str) {
        l.d(str, "");
        if (f123455g != null && b.a().a(false, "download_not_block_user", false)) {
            List<String> list = f123461m;
            String str2 = f123455g;
            if (str2 == null) {
                l.b();
            }
            if (!list.contains(str2) || !list.contains(str)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
