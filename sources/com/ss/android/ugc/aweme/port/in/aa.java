package com.ss.android.ugc.aweme.port.in;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.cz.a.l;
import com.ss.android.ugc.aweme.cz.a.m;
import com.ss.android.ugc.aweme.discover.model.Challenge;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import f.a.t;
import h.z;
import java.io.Serializable;
import java.util.List;

public interface aa extends p {

    /* renamed from: a  reason: collision with root package name */
    public static final a f115581a = a.f115582a;

    public static final class b {
        static {
            Covode.recordClassIndex(74501);
        }
    }

    public interface c {

        public static final class a {
            static {
                Covode.recordClassIndex(74503);
            }
        }

        static {
            Covode.recordClassIndex(74502);
        }

        com.ss.android.ugc.aweme.cz.a.e a();

        t<List<MusicModel>> a(int i2);

        t<a> a(String str, long j2, int i2, int i3, int i4, boolean z);

        String a(com.ss.android.ugc.aweme.c.a aVar);

        void a(com.ss.android.ugc.aweme.cz.a.i iVar);

        void a(m mVar);

        void a(ExtractFramesModel extractFramesModel, String str, String str2, long j2);

        void a(String str, String str2, String str3, long j2);

        void a(List<String> list, String str, String str2);

        void a(List<String> list, String str, boolean z);

        void a(boolean z);

        void b();

        void b(m mVar);

        void b(boolean z);

        MusicModel c();

        void c(boolean z);

        void d();

        void d(boolean z);
    }

    public interface d {
        static {
            Covode.recordClassIndex(74504);
        }

        com.ss.android.ugc.aweme.shortvideo.c a(int i2);

        void a();

        void a(androidx.appcompat.app.d dVar, FrameLayout frameLayout);

        void a(com.ss.android.ugc.aweme.cz.a.g gVar);

        void a(com.ss.android.ugc.aweme.cz.a.h hVar);

        void a(com.ss.android.ugc.aweme.cz.a.j jVar);

        void a(com.ss.android.ugc.aweme.cz.a.k kVar);

        void a(l lVar);

        void a(List<String> list);

        void a(boolean z);

        com.ss.android.ugc.aweme.shortvideo.c b(int i2);

        void b();

        void c();

        void d();

        int e();

        void f();

        void g();

        void k();
    }

    public interface e {
        static {
            Covode.recordClassIndex(74505);
        }

        void a(int i2);
    }

    public interface f {
        static {
            Covode.recordClassIndex(74506);
        }

        void a(Exception exc);

        void a(String str, com.ss.android.ugc.aweme.shortvideo.c cVar);
    }

    public interface g {
        static {
            Covode.recordClassIndex(74507);
        }

        g a(com.ss.android.ugc.aweme.cz.a.b bVar);

        g a(List<String> list);
    }

    public static abstract class h extends RecyclerView.a<RecyclerView.ViewHolder> {
        static {
            Covode.recordClassIndex(74508);
        }

        public int a() {
            return -1;
        }

        public void a(int i2) {
        }

        public void a(int i2, boolean z) {
        }

        public void a(com.ss.android.ugc.aweme.cz.a.k kVar) {
        }

        public void a(com.ss.android.ugc.aweme.shortvideo.c cVar) {
        }

        public void a(List<com.ss.android.ugc.aweme.shortvideo.c> list) {
        }

        public int b() {
            return -1;
        }

        public void b(int i2) {
        }

        public abstract MusicModel c(int i2);

        public void c() {
        }

        public void d() {
        }
    }

    public interface i {
        static {
            Covode.recordClassIndex(74509);
        }

        t<String> a();

        void a(com.ss.android.ugc.aweme.c.e eVar);

        boolean b();

        void c();

        void d();
    }

    public interface j {
        static {
            Covode.recordClassIndex(74510);
        }

        void a(boolean z);

        void b(boolean z);
    }

    public interface k {
        static {
            Covode.recordClassIndex(74511);
        }

        void a();

        void a(List<? extends MusicModel> list, boolean z);

        void b();

        void c();
    }

    static {
        Covode.recordClassIndex(74499);
    }

    d a(androidx.appcompat.app.d dVar, com.ss.android.ugc.asve.editor.g gVar, com.ss.android.ugc.aweme.cz.a.a aVar, boolean z, int i2, h.f.a.a<String> aVar2);

    g a(com.ss.android.ugc.aweme.cz.a.f fVar);

    h a(List<com.ss.android.ugc.aweme.shortvideo.c> list, com.ss.android.ugc.aweme.cz.a.j jVar);

    AVChallenge a(Challenge challenge);

    com.ss.android.ugc.aweme.shortvideo.c a(Object obj);

    com.ss.android.ugc.aweme.shortvideo.d a(Serializable serializable);

    Object a(com.ss.android.ugc.aweme.shortvideo.d dVar);

    List<com.ss.android.ugc.aweme.shortvideo.c> a(int i2, String str);

    void a(Activity activity, int i2, com.ss.android.ugc.aweme.cz.a.c cVar, h.f.a.b<? super com.ss.android.ugc.aweme.cz.a.d, z> bVar, h.f.a.a<z> aVar);

    void a(Activity activity, FrameLayout frameLayout, com.ss.android.ugc.aweme.cz.a.c cVar, h.f.a.b<? super com.ss.android.ugc.aweme.cz.a.d, z> bVar, h.f.a.a<z> aVar, h.f.a.a<z> aVar2);

    void a(Context context, String str, boolean z, ProgressDialog progressDialog, f fVar);

    boolean a(int i2);

    int b(String str);

    com.ss.android.ugc.aweme.shortvideo.c b(MusicModel musicModel);

    com.ss.android.ugc.aweme.shortvideo.c c(String str);

    void d(String str);

    void e();

    void f();

    com.ss.android.ugc.aweme.port.in.a.a g();

    boolean h();

    void i();

    void j();

    c k();

    i l();

    Class<?> m();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f115582a = new a();

        private a() {
        }

        static {
            Covode.recordClassIndex(74500);
        }
    }
}
