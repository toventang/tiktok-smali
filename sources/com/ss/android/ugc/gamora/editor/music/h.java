package com.ss.android.ugc.gamora.editor.music;

import android.app.Activity;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.o.f;
import com.ss.android.ugc.asve.editor.g;
import com.ss.android.ugc.aweme.port.in.a.d;
import com.ss.android.ugc.aweme.port.in.l;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.utils.bz;
import com.ss.android.ugc.gamora.editor.music.i;
import com.zhiliaoapp.musically.R;
import h.f.b.m;
import h.i;
import java.util.List;
import java.util.Objects;

public class h extends com.bytedance.ui_component.b<EditMusicViewModel> implements com.bytedance.o.a {

    /* renamed from: a  reason: collision with root package name */
    final com.bytedance.scene.group.b f146233a;

    /* renamed from: b  reason: collision with root package name */
    public final int f146234b = R.id.c9b;

    /* renamed from: c  reason: collision with root package name */
    private final h.h f146235c = i.a((h.f.a.a) new a(this));

    /* renamed from: d  reason: collision with root package name */
    private final h.f.a.a<EditMusicViewModel> f146236d = b.f146238a;

    /* renamed from: e  reason: collision with root package name */
    private final f f146237e;

    static {
        Covode.recordClassIndex(96119);
    }

    private final i a() {
        return (i) this.f146235c.getValue();
    }

    @Override // com.bytedance.ui_component.b
    public final h.f.a.a<EditMusicViewModel> b() {
        return this.f146236d;
    }

    @Override // com.bytedance.ui_component.b
    public final com.bytedance.scene.group.b e() {
        return this.f146233a;
    }

    @Override // com.bytedance.o.a
    public f getDiContainer() {
        return this.f146237e;
    }

    static final class b extends m implements h.f.a.a<EditMusicViewModel> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f146238a = new b();

        static {
            Covode.recordClassIndex(96121);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ EditMusicViewModel invoke() {
            return new EditMusicViewModel();
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void d() {
        com.ss.android.ugc.aweme.port.in.a.a aVar = a().f146245f;
        if (aVar != null) {
            aVar.b();
        }
    }

    static final class a extends m implements h.f.a.a<i> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(96120);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ i invoke() {
            i iVar = new i(this.this$0.getDiContainer(), this.this$0.f146233a);
            this.this$0.f146233a.a(this.this$0.f146234b, iVar, "EditMusicVerticalScene");
            return iVar;
        }
    }

    @Override // com.bytedance.ui_component.b
    public final void c() {
        int i2;
        boolean z;
        boolean z2;
        i a2 = a();
        if (a2.f146245f == null) {
            boolean a3 = com.ss.android.ugc.aweme.shortvideo.edit.videolength.a.a(a2.a());
            a2.f146245f = l.f115658a.b().g();
            List<String> list = null;
            VideoPublishEditModel a4 = a2.a();
            if (a4.isMvThemeVideoType() && !bz.a(a4)) {
                list = a4.mvCreateVideoData.musicIds;
            }
            a2.a();
            VideoPublishEditModel a5 = a2.a();
            Activity t = a2.t();
            Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            j jVar = new j(a5, (e) t);
            boolean z3 = a2.a().mIsFromDraft;
            Activity t2 = a2.t();
            Objects.requireNonNull(t2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            e eVar = (e) t2;
            g value = a2.b().C().getValue();
            if (value != null) {
                i2 = value.j();
            } else {
                i2 = 0;
            }
            String str = a2.a().creationId;
            if (str == null) {
                str = "";
            }
            boolean z4 = a2.a().isPhotoMvMode;
            com.ss.android.ugc.aweme.port.in.a.e C = a2.C();
            if (a2.a().realHasOriginalSound() || a2.a().isFastImport) {
                z = true;
            } else {
                z = false;
            }
            boolean z5 = a2.a().editMusicSyncMode;
            if (com.bytedance.ies.abmock.b.a().a(true, "ai_music_panel_new", 0) != 2 || a2.a().mIsFromDraft) {
                z2 = false;
            } else {
                z2 = true;
            }
            d dVar = new d(list, z3, eVar, i2, a3 ? 1 : 0, str, z4, C, z, z5, z2, a2.f146248i, jVar);
            com.ss.android.ugc.aweme.port.in.a.a aVar = a2.f146245f;
            if (aVar != null) {
                aVar.a(dVar);
            }
            a2.d().g().b(a2, new i.g(a2));
        }
        com.ss.android.ugc.aweme.port.in.a.a aVar2 = a2.f146245f;
        if (aVar2 != null) {
            aVar2.a(a2.C());
        }
        com.ss.android.ugc.aweme.port.in.a.a aVar3 = a2.f146245f;
        if (aVar3 != null) {
            aVar3.a();
        }
    }

    public h(f fVar, com.bytedance.scene.group.b bVar) {
        h.f.b.l.d(fVar, "");
        h.f.b.l.d(bVar, "");
        this.f146237e = fVar;
        this.f146233a = bVar;
    }
}
