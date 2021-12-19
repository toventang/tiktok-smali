package com.ss.android.ugc.aweme.tcm.api.b;

import com.bytedance.covode.number.Covode;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static a f138559a;

    /* renamed from: b  reason: collision with root package name */
    public static b f138560b;

    /* renamed from: c  reason: collision with root package name */
    public static final c f138561c = new c();

    public interface a {
        static {
            Covode.recordClassIndex(90648);
        }

        String getBrandedContentType();

        String getStarAtlasContent();

        void setBrandedContentType(String str);

        void setStarAtlasContent(String str);
    }

    public interface b {
        static {
            Covode.recordClassIndex(90649);
        }

        void setBrandedContentType(String str);
    }

    private c() {
    }

    static {
        Covode.recordClassIndex(90647);
    }

    public static final String a() {
        a aVar = f138559a;
        if (aVar != null) {
            return aVar.getStarAtlasContent();
        }
        return null;
    }

    public static final String b() {
        a aVar = f138559a;
        if (aVar != null) {
            return aVar.getBrandedContentType();
        }
        return null;
    }

    public static final void a(String str) {
        a aVar = f138559a;
        if (aVar != null) {
            aVar.setStarAtlasContent(str);
        }
    }

    public static final void b(String str) {
        String str2;
        a aVar = f138559a;
        if (aVar != null) {
            if (str == null) {
                str2 = "0";
            } else {
                str2 = str;
            }
            aVar.setBrandedContentType(str2);
        }
        b bVar = f138560b;
        if (bVar != null) {
            if (str == null) {
                str = "0";
            }
            bVar.setBrandedContentType(str);
        }
    }
}
