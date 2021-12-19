package com.ss.android.ugc.aweme.choosemusic.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.utils.b;
import com.ss.android.ugc.aweme.framework.a.a;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final /* synthetic */ class w implements g {

    /* renamed from: a  reason: collision with root package name */
    private final u f70693a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f70694b;

    /* renamed from: c  reason: collision with root package name */
    private final long f70695c;

    static {
        Covode.recordClassIndex(43584);
    }

    w(u uVar, WeakReference weakReference, long j2) {
        this.f70693a = uVar;
        this.f70694b = weakReference;
        this.f70695c = j2;
    }

    @Override // b.g
    public final Object then(i iVar) {
        u uVar = this.f70693a;
        WeakReference weakReference = this.f70694b;
        long j2 = this.f70695c;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        b.a(System.currentTimeMillis() - j2);
        if (iVar.c()) {
            uVar.f70687a.a("local_music_list_status", (Object) 1);
            a.a(2, "Local Sound", "Load Local Sound Task Failed");
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            a.a(2, "Local Sound", "Load Local Sound Task Succeed");
            uVar.f70687a.a("local_music_list_status", (Object) 0);
            com.ss.android.ugc.aweme.arch.b bVar = new com.ss.android.ugc.aweme.arch.b();
            bVar.a("list_data", iVar.d()).a("list_hasmore", false).a("action_type", 1);
            uVar.f70687a.a("local_music_list_data", bVar);
            return null;
        }
    }
}
