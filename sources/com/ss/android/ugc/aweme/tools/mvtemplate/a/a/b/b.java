package com.ss.android.ugc.aweme.tools.mvtemplate.a.a.b;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effectplatform.f;
import com.ss.android.ugc.aweme.services.upload.IPhotoPreDownloadMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.c;
import com.ss.android.ugc.aweme.tools.mvtemplate.a.d;
import java.lang.ref.WeakReference;
import java.util.List;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public String f140672a;

    /* renamed from: b  reason: collision with root package name */
    public MusicModel f140673b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f140674c;

    /* renamed from: d  reason: collision with root package name */
    public IPhotoPreDownloadMusic f140675d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f140676e;

    /* renamed from: f  reason: collision with root package name */
    public final d f140677f;

    /* renamed from: g  reason: collision with root package name */
    public WeakReference<Activity> f140678g;

    /* renamed from: h  reason: collision with root package name */
    public c f140679h;

    /* renamed from: i  reason: collision with root package name */
    public com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b f140680i;

    /* renamed from: j  reason: collision with root package name */
    public List<String> f140681j;

    /* renamed from: k  reason: collision with root package name */
    public String f140682k;

    /* renamed from: l  reason: collision with root package name */
    public f f140683l;

    /* renamed from: m  reason: collision with root package name */
    public String f140684m;
    public MusicModel n;

    static {
        Covode.recordClassIndex(91865);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, WeakReference weakReference, c cVar, com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b bVar, List list, String str, int i2) {
        this(dVar, (i2 & 2) != 0 ? null : weakReference, (i2 & 4) != 0 ? null : cVar, (i2 & 8) != 0 ? null : bVar, (i2 & 16) != 0 ? null : list, (i2 & 32) == 0 ? str : null, null, null);
    }

    public b(d dVar, WeakReference<Activity> weakReference, c cVar, com.ss.android.ugc.aweme.tools.mvtemplate.a.a.a.b bVar, List<String> list, String str, String str2, MusicModel musicModel) {
        this.f140677f = dVar;
        this.f140678g = weakReference;
        this.f140679h = cVar;
        this.f140680i = bVar;
        this.f140681j = list;
        this.f140682k = str;
        this.f140683l = null;
        this.f140684m = str2;
        this.n = musicModel;
        this.f140674c = true;
    }
}
