package com.ss.android.ugc.aweme.comment.api;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpreload.c;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.comment.preload.CommentPreload;
import com.ss.android.ugc.aweme.comment.preload.CommentPreloadRequest;
import com.ss.android.ugc.aweme.preload.PreloadExtraInfo;
import java.util.ArrayList;

public final /* synthetic */ class a implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f71452a;

    /* renamed from: b  reason: collision with root package name */
    private final int f71453b;

    /* renamed from: c  reason: collision with root package name */
    private final String f71454c;

    /* renamed from: d  reason: collision with root package name */
    private final long f71455d = 0;

    /* renamed from: e  reason: collision with root package name */
    private final int f71456e = 20;

    /* renamed from: f  reason: collision with root package name */
    private final String f71457f = null;

    /* renamed from: g  reason: collision with root package name */
    private final String f71458g;

    /* renamed from: h  reason: collision with root package name */
    private final int f71459h;

    static {
        Covode.recordClassIndex(43983);
    }

    public a(String str, int i2, String str2, String str3, int i3) {
        this.f71452a = str;
        this.f71453b = i2;
        this.f71454c = str2;
        this.f71458g = str3;
        this.f71459h = i3;
    }

    @Override // com.bytedance.ies.powerpreload.c.b
    public final void a(com.bytedance.ies.powerpreload.d.a aVar) {
        String str = this.f71452a;
        int i2 = this.f71453b;
        String str2 = this.f71454c;
        long j2 = this.f71455d;
        int i3 = this.f71456e;
        String str3 = this.f71457f;
        String str4 = this.f71458g;
        int i4 = this.f71459h;
        ArrayList arrayList = new ArrayList();
        arrayList.add("aweme_id");
        arrayList.add("cursor");
        CommentPreloadRequest a2 = CommentApi.a(str2, j2, i3, str3, (Long) null, com.ss.android.ugc.aweme.app.c.c.a(str4), new PreloadExtraInfo(UGCMonitor.EVENT_COMMENT, str, "/aweme/v2/comment/list/", i2, arrayList));
        Intent intent = new Intent();
        intent.putExtra("comment_preload_request", a2);
        if (i4 != -1) {
            intent.putExtra("comment_ttl", i4);
        }
        aVar.a(CommentApi.a(intent), CommentPreload.class);
    }
}
