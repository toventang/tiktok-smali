package com.ss.android.ugc.aweme.tcm.impl.b;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.port.in.ax;
import com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.ss.android.ugc.aweme.shortvideo.model.PublishExtensionModel;
import com.ss.android.ugc.aweme.shortvideo.ui.az;
import com.ss.android.ugc.aweme.tcm.api.b.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class e extends az implements c.a {

    /* renamed from: m  reason: collision with root package name */
    public ExtensionDataRepo f138592m;
    private String n;
    private String o;
    private String p = "0";
    private ax.a q;

    static {
        Covode.recordClassIndex(90673);
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.b.c.a
    public final String getBrandedContentType() {
        return this.p;
    }

    public final ax.a getPublishExtensionDataContainer() {
        return this.q;
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.b.c.a
    public final String getStarAtlasContent() {
        return this.o;
    }

    public final String getStarAtlasHashTag() {
        return this.n;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c.f138559a = this;
    }

    public final ExtensionDataRepo getExtensionDataRepo() {
        ExtensionDataRepo extensionDataRepo = this.f138592m;
        if (extensionDataRepo == null) {
            l.a("extensionDataRepo");
        }
        return extensionDataRepo;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (l.a(c.f138559a, this)) {
            c.f138559a = null;
        }
    }

    public final void setPublishExtensionDataContainer(ax.a aVar) {
        this.q = aVar;
    }

    public final void setStarAtlasHashTag(String str) {
        this.n = str;
    }

    public final void setExtensionDataRepo(ExtensionDataRepo extensionDataRepo) {
        l.d(extensionDataRepo, "");
        this.f138592m = extensionDataRepo;
    }

    public e(Context context) {
        super(context);
        setDrawableLeft(2131232440);
        setSubtitleMaxWidth(n.a(120.0d));
        a.a(false);
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.b.c.a
    public final void setBrandedContentType(String str) {
        String str2 = "";
        l.d(str, str2);
        this.p = str;
        if (d.a()) {
            Context context = getContext();
            String str3 = this.p;
            if (TextUtils.equals(str3, "1") || TextUtils.equals(str3, "2")) {
                if (context != null) {
                    str2 = context.getString(R.string.g3d);
                } else {
                    str2 = null;
                }
            }
            setSubtitle(str2);
        }
    }

    @Override // com.ss.android.ugc.aweme.tcm.api.b.c.a
    public final void setStarAtlasContent(String str) {
        boolean z;
        this.o = str;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        a.a(!z);
        if (!d.a()) {
            ax.a aVar = this.q;
            String str2 = "";
            if (aVar != null) {
                PublishExtensionModel fromString = PublishExtensionModel.fromString(aVar.a());
                l.b(fromString, str2);
                fromString.isStarAtlas = true ^ TextUtils.isEmpty(getStarAtlasContent());
                fromString.starAtlasContent = str;
                aVar.a(PublishExtensionModel.toString(fromString));
            }
            if (!TextUtils.isEmpty(getStarAtlasContent())) {
                ExtensionDataRepo extensionDataRepo = this.f138592m;
                if (extensionDataRepo == null) {
                    l.a("extensionDataRepo");
                }
                extensionDataRepo.getAddStarAtlasTag().invoke();
            } else {
                ExtensionDataRepo extensionDataRepo2 = this.f138592m;
                if (extensionDataRepo2 == null) {
                    l.a("extensionDataRepo");
                }
                extensionDataRepo2.getRemoveStarAtlasTag().invoke();
            }
            Context context = getContext();
            if (!TextUtils.isEmpty(str)) {
                if (context != null) {
                    str2 = context.getString(R.string.g3d);
                } else {
                    str2 = null;
                }
            }
            setSubtitle(str2);
        }
    }
}
