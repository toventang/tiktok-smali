package com.ss.android.ugc.aweme.bu.b;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.cn;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final h f68811a = i.a((h.f.a.a) c.f68815a);

    /* renamed from: b  reason: collision with root package name */
    public static final h f68812b = i.a((h.f.a.a) b.f68814a);

    /* renamed from: c  reason: collision with root package name */
    public static final C1555a f68813c = new C1555a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.bu.b.a$a  reason: collision with other inner class name */
    public static final class C1555a {
        static {
            Covode.recordClassIndex(42387);
        }

        private static boolean a() {
            return ((Boolean) a.f68811a.getValue()).booleanValue();
        }

        private static int b() {
            return ((Number) a.f68812b.getValue()).intValue();
        }

        private C1555a() {
        }

        public /* synthetic */ C1555a(byte b2) {
            this();
        }

        public static boolean a(Aweme aweme) {
            boolean mvThemeRecordMode;
            int mvPlan;
            String str;
            l.d(aweme, "");
            if (cn.f89703a) {
                mvThemeRecordMode = a();
                mvPlan = b();
            } else {
                mvThemeRecordMode = AVExternalServiceImpl.a().configService().avsettingsConfig().getMvThemeRecordMode();
                mvPlan = AVExternalServiceImpl.a().configService().avsettingsConfig().getMvPlan();
            }
            if (aweme.getUploadMiscInfoStruct() != null) {
                com.ss.android.ugc.aweme.shortvideo.i uploadMiscInfoStruct = aweme.getUploadMiscInfoStruct();
                if (uploadMiscInfoStruct != null) {
                    str = uploadMiscInfoStruct.mvThemeId;
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str) && mvThemeRecordMode) {
                    if (aweme.getUploadMiscInfoStruct().mvType != 1 || mvPlan >= 2) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
    }

    static final class b extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f68814a = new b();

        static {
            Covode.recordClassIndex(42388);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(AVExternalServiceImpl.a().configService().avsettingsConfig().getMvPlan());
        }
    }

    static final class c extends m implements h.f.a.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f68815a = new c();

        static {
            Covode.recordClassIndex(42389);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(AVExternalServiceImpl.a().configService().avsettingsConfig().getMvThemeRecordMode());
        }
    }

    static {
        Covode.recordClassIndex(42386);
    }
}
