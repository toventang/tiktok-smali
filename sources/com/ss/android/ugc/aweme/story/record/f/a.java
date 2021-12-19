package com.ss.android.ugc.aweme.story.record.f;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.dt;
import com.ss.android.ugc.aweme.shortvideo.h;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.story.base.model.ETParams;
import com.ss.android.ugc.aweme.story.base.model.EditContext;
import com.ss.android.ugc.aweme.story.record.recordcontrol.StoryWorkspaceImpl;
import h.f.b.l;
import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f138278a;

    /* renamed from: b  reason: collision with root package name */
    public String f138279b;

    /* renamed from: c  reason: collision with root package name */
    public String f138280c;

    /* renamed from: d  reason: collision with root package name */
    public String f138281d;

    /* renamed from: e  reason: collision with root package name */
    public String f138282e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f138283f;

    /* renamed from: g  reason: collision with root package name */
    public StoryWorkspaceImpl f138284g;

    /* renamed from: h  reason: collision with root package name */
    public String f138285h;

    /* renamed from: i  reason: collision with root package name */
    public String f138286i = "";

    /* renamed from: j  reason: collision with root package name */
    public long f138287j = -1;

    /* renamed from: k  reason: collision with root package name */
    public final CameraComponentModel f138288k;

    static {
        Covode.recordClassIndex(90458);
    }

    public final String a() {
        if (this.f138278a == null) {
            this.f138278a = h.a(this.f138279b);
        }
        return this.f138278a;
    }

    public final Workspace b() {
        Workspace workspace = this.f138288k.f124713h;
        l.b(workspace, "");
        return workspace;
    }

    public final ExtractFramesModel d() {
        ExtractFramesModel extractFramesModel = this.f138288k.w;
        l.b(extractFramesModel, "");
        return extractFramesModel;
    }

    private final float g() {
        return new BigDecimal((double) this.f138288k.A).setScale(1, 4).floatValue();
    }

    public final void c() {
        this.f138278a = h.a(this.f138279b);
        StoryWorkspaceImpl storyWorkspaceImpl = this.f138284g;
        if (storyWorkspaceImpl != null) {
            storyWorkspaceImpl.e(a());
        }
    }

    public final ShortVideoContext e() {
        ShortVideoContext shortVideoContext = new ShortVideoContext(this.f138288k);
        shortVideoContext.r = this.f138280c;
        shortVideoContext.q = this.f138279b;
        shortVideoContext.p = a();
        shortVideoContext.aP = true;
        shortVideoContext.aQ = this.f138283f;
        shortVideoContext.a(b());
        shortVideoContext.d(false);
        return shortVideoContext;
    }

    public final EditContext f() {
        boolean z;
        dt j2;
        TimeSpeedModelExtension timeSpeedModelExtension;
        List<String> aRTexts;
        dt j3;
        TimeSpeedModelExtension timeSpeedModelExtension2;
        ETParams eTParams = new ETParams(this.f138280c, this.f138281d, this.f138285h, 0, 0, g(), 24, null);
        boolean z2 = this.f138283f;
        File e2 = b().e();
        dt j4 = this.f138288k.j();
        if (j4 == null || j4.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        List<String> list = null;
        if (z || (j2 = this.f138288k.j()) == null || (timeSpeedModelExtension = (TimeSpeedModelExtension) j2.get(0)) == null) {
            aRTexts = null;
        } else {
            aRTexts = timeSpeedModelExtension.getARTexts();
        }
        dt j5 = this.f138288k.j();
        if (!(j5 == null || j5.isEmpty() || (j3 = this.f138288k.j()) == null || (timeSpeedModelExtension2 = (TimeSpeedModelExtension) j3.get(0)) == null)) {
            list = timeSpeedModelExtension2.getBubbleTexts();
        }
        return new EditContext(eTParams, null, null, z2, e2, aRTexts, list, ShortVideoContext.a((ArrayList<TimeSpeedModelExtension>) this.f138288k.f124711f), 0, null, null, null, null, this.f138288k.i(), this.f138287j, this.f138286i, 7942, null);
    }

    public final void a(String str) {
        l.d(str, "");
        this.f138286i = str;
    }

    public a(CameraComponentModel cameraComponentModel) {
        l.d(cameraComponentModel, "");
        this.f138288k = cameraComponentModel;
        String uuid = UUID.randomUUID().toString();
        l.b(uuid, "");
        this.f138279b = uuid;
    }

    public final void a(ExtractFramesModel extractFramesModel) {
        l.d(extractFramesModel, "");
        this.f138288k.w = extractFramesModel;
    }
}
