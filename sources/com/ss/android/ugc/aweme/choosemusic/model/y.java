package com.ss.android.ugc.aweme.choosemusic.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.utils.b;
import com.ss.android.ugc.aweme.framework.a.a;
import java.lang.ref.WeakReference;

/* access modifiers changed from: package-private */
public final /* synthetic */ class y implements g {

    /* renamed from: a  reason: collision with root package name */
    private final u f70700a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f70701b;

    /* renamed from: c  reason: collision with root package name */
    private final long f70702c;

    static {
        Covode.recordClassIndex(43586);
    }

    y(u uVar, WeakReference weakReference, long j2) {
        this.f70700a = uVar;
        this.f70701b = weakReference;
        this.f70702c = j2;
    }

    @Override // b.g
    public final Object then(i iVar) {
        u uVar = this.f70700a;
        WeakReference weakReference = this.f70701b;
        long j2 = this.f70702c;
        uVar.f70689c = false;
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
            bVar.a("list_data", iVar.d()).a("list_hasmore", Boolean.valueOf(!uVar.f70688b)).a("action_type", 1);
            uVar.f70687a.a("local_music_list_data", bVar);
            return null;
        }
    }
}
