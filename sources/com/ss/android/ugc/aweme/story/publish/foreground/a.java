package com.ss.android.ugc.aweme.story.publish.foreground;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.df.c;
import com.ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.ss.android.ugc.aweme.settings.h;
import com.ss.android.ugc.aweme.shortvideo.publish.k;
import com.ss.android.ugc.aweme.story.publish.foreground.StoryPublishNotificationService;
import h.f.b.l;
import java.util.List;

public final class a extends k implements c.a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f138136a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f138137b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f138138c;

    /* renamed from: d  reason: collision with root package name */
    private final List<ScheduleInfo> f138139d;

    static {
        Covode.recordClassIndex(90336);
    }

    @Override // com.ss.android.ugc.aweme.df.c.a
    public final void b() {
    }

    @Override // com.ss.android.ugc.aweme.df.c.a
    public final void a() {
        c();
    }

    private final void c() {
        if (h.a() && this.f138136a) {
            if (!this.f138138c) {
                StoryPublishNotificationService.a.a();
                this.f138138c = true;
            }
            this.f138137b = StoryPublishNotificationService.a.a(this.f138139d);
        }
    }

    public a(List<ScheduleInfo> list) {
        l.d(list, "");
        this.f138139d = list;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.publish.k
    public final void onProgress(int i2, Object obj) {
        this.f138136a = true;
        if (!this.f138137b) {
            c cVar = c.C1870c.f80046a;
            l.b(cVar, "");
            if (cVar.a()) {
                c();
            }
        }
    }
}
