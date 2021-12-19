package com.ss.android.ugc.aweme.choosemusic.model;

import b.g;
import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.choosemusic.utils.b;
import com.ss.android.ugc.aweme.framework.a.a;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.List;

public final /* synthetic */ class z implements g {

    /* renamed from: a  reason: collision with root package name */
    private final u f70703a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f70704b;

    /* renamed from: c  reason: collision with root package name */
    private final long f70705c;

    static {
        Covode.recordClassIndex(43587);
    }

    public z(u uVar, WeakReference weakReference, long j2) {
        this.f70703a = uVar;
        this.f70704b = weakReference;
        this.f70705c = j2;
    }

    @Override // b.g
    public final Object then(i iVar) {
        u uVar = this.f70703a;
        WeakReference weakReference = this.f70704b;
        long j2 = this.f70705c;
        uVar.f70689c = false;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        b.a(System.currentTimeMillis() - j2);
        if (iVar.c()) {
            uVar.f70687a.a("local_music_list_load_more_status", (Object) 1);
            a.a(2, "Local Sound", "Load Local Sound Task Failed");
            return null;
        } else if (!iVar.a()) {
            return null;
        } else {
            a.a(2, "Local Sound", "Load Local Sound Task Succeed");
            uVar.f70687a.a("local_music_list_load_more_status", (Object) 0);
            List list = (List) ((com.ss.android.ugc.aweme.arch.b) uVar.f70687a.a("local_music_list_data")).a("list_data");
            list.addAll((Collection) iVar.d());
            com.ss.android.ugc.aweme.arch.b bVar = new com.ss.android.ugc.aweme.arch.b();
            bVar.a("list_data", list).a("list_hasmore", Boolean.valueOf(true ^ uVar.f70688b)).a("action_type", 2);
            uVar.f70687a.a("local_music_list_data", bVar);
            return null;
        }
    }
}
