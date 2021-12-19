package com.ss.android.ugc.aweme.tcm.api.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.TagBAUser;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static AbstractC3653a f138554a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f138555b = new a();

    /* renamed from: com.ss.android.ugc.aweme.tcm.api.b.a$a  reason: collision with other inner class name */
    public interface AbstractC3653a {
        static {
            Covode.recordClassIndex(90645);
        }

        String getBcStarAtlasContent();

        String getBcType();

        TagBAUser getShouldBeDetag();

        TagBAUser getTagBA();

        void setBcStarAtlasContent(String str);

        void setBcType(String str);

        void setShouldBeDetag(TagBAUser tagBAUser);

        void setTagBA(TagBAUser tagBAUser);
    }

    private a() {
    }

    static {
        Covode.recordClassIndex(90644);
    }

    public static final String a() {
        AbstractC3653a aVar = f138554a;
        if (aVar != null) {
            return aVar.getBcStarAtlasContent();
        }
        return null;
    }

    public static final String b() {
        AbstractC3653a aVar = f138554a;
        if (aVar != null) {
            return aVar.getBcType();
        }
        return null;
    }

    public static final TagBAUser c() {
        AbstractC3653a aVar = f138554a;
        if (aVar != null) {
            return aVar.getTagBA();
        }
        return null;
    }

    public static final void d() {
        AbstractC3653a aVar = f138554a;
        if (aVar != null) {
            aVar.setShouldBeDetag(null);
        }
    }

    public static final void a(TagBAUser tagBAUser) {
        AbstractC3653a aVar = f138554a;
        if (aVar != null) {
            aVar.setTagBA(tagBAUser);
        }
    }

    public static final void a(String str) {
        AbstractC3653a aVar = f138554a;
        if (aVar != null) {
            aVar.setBcStarAtlasContent(str);
        }
    }

    public static final void b(String str) {
        AbstractC3653a aVar = f138554a;
        if (aVar != null) {
            if (str == null) {
                str = "0";
            }
            aVar.setBcType(str);
        }
    }
}
