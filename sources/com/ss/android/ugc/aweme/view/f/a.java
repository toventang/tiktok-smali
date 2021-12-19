package com.ss.android.ugc.aweme.view.f;

import android.graphics.Color;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.ah;
import com.bytedance.jedi.arch.t;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.ab;
import com.ss.android.ugc.aweme.common.u;
import com.ss.android.ugc.aweme.common.y;
import com.ss.android.ugc.aweme.model.q;
import com.ss.android.ugc.aweme.model.r;
import com.ss.android.ugc.aweme.utils.hl;
import com.ss.android.ugc.aweme.utils.hx;
import com.ss.android.ugc.aweme.view.customView.NaviGLSurfaceView;
import com.ss.android.ugc.aweme.view.f.f;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviCreatorViewModel;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.i;
import h.z;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public final class a extends com.ss.android.ugc.aweme.view.customView.b implements f.a {

    /* renamed from: d  reason: collision with root package name */
    public static final C3846a f144236d = new C3846a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public String f144237b = "avatar_hub";

    /* renamed from: c  reason: collision with root package name */
    public boolean f144238c;

    /* renamed from: e  reason: collision with root package name */
    private final String f144239e = "ImageEditorContainer";

    /* renamed from: f  reason: collision with root package name */
    private final h.h f144240f = i.a((h.f.a.a) new b(this));

    /* renamed from: g  reason: collision with root package name */
    private SparseArray f144241g;

    static {
        Covode.recordClassIndex(94405);
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final View a(int i2) {
        if (this.f144241g == null) {
            this.f144241g = new SparseArray();
        }
        View view = (View) this.f144241g.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f144241g.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final int b() {
        return R.layout.apv;
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final boolean d() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final void j() {
        SparseArray sparseArray = this.f144241g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    public final ProfileNaviCreatorViewModel k() {
        return (ProfileNaviCreatorViewModel) this.f144240f.getValue();
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.view.customView.b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        j();
    }

    /* renamed from: com.ss.android.ugc.aweme.view.f.a$a  reason: collision with other inner class name */
    public static final class C3846a {
        static {
            Covode.recordClassIndex(94406);
        }

        private C3846a() {
        }

        public /* synthetic */ C3846a(byte b2) {
            this();
        }

        public static a a(String str) {
            l.d(str, "");
            a aVar = new a();
            aVar.f144237b = str;
            return aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.view.f.f.a
    public final void p() {
        m();
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final NaviGLSurfaceView e() {
        return (NaviGLSurfaceView) a(R.id.daj);
    }

    @Override // com.ss.android.ugc.aweme.view.f.f.a
    public final void n() {
        NaviGLSurfaceView e2 = e();
        if (e2 != null) {
            e2.setVisibility(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.view.f.f.a
    public final void o() {
        NaviGLSurfaceView e2 = e();
        if (e2 != null) {
            e2.setVisibility(4);
        }
    }

    static final class b extends m implements h.f.a.a<ProfileNaviCreatorViewModel> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94407);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ProfileNaviCreatorViewModel invoke() {
            JediViewModel a2 = t.a(this.this$0.requireActivity()).a(ProfileNaviCreatorViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final void c() {
        androidx.fragment.app.i supportFragmentManager;
        b(null);
        androidx.fragment.app.e activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            new f(this.f144237b, this).show(supportFragmentManager, this.f144239e);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g extends m implements h.f.a.a<z> {
        final /* synthetic */ File $file;
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94413);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(a aVar, File file) {
            super(0);
            this.this$0 = aVar;
            this.$file = file;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ z invoke() {
            ProfileNaviCreatorViewModel k2 = this.this$0.k();
            File file = this.$file;
            l.d(file, "");
            r.f110814d = new com.ss.android.ugc.aweme.model.c(file);
            q qVar = r.f110811a;
            if (qVar != null) {
                ProfileNaviCreatorViewModel.a.a(file, new ProfileNaviCreatorViewModel.o(new UrlModel(), qVar));
                k2.j();
                if (((ProfileNaviCreatorState) k2.at_()).getShouldSetAsProfileImage()) {
                    ProfileNaviCreatorViewModel.i();
                }
                k2.d(ProfileNaviCreatorViewModel.n.f144324a);
            }
            return z.f158842a;
        }
    }

    static final class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f144243a;

        static {
            Covode.recordClassIndex(94414);
        }

        h(a aVar) {
            this.f144243a = aVar;
        }

        public final void run() {
            com.ss.android.ugc.aweme.view.customView.a naviManager;
            NaviGLSurfaceView e2 = this.f144243a.e();
            if (e2 != null && (naviManager = e2.getNaviManager()) != null) {
                naviManager.f144172a.lock();
                naviManager.t = true;
                naviManager.w = new ArrayList();
                naviManager.f144172a.unlock();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.view.customView.b
    public final void g() {
        super.g();
        f.a.b.b unused = selectSubscribe(k(), b.f144244a, new ah(), new c(this));
        f.a.b.b unused2 = selectSubscribe(k(), c.f144246a, new ah(), new d(this));
        f.a.b.b unused3 = selectSubscribe(a(), d.f144248a, new ah(), new e(this));
        f.a.b.b unused4 = selectSubscribe(a(), e.f144250a, new ah(), new f(this));
    }

    public final void l() {
        com.ss.android.ugc.aweme.view.customView.a naviManager;
        y a2 = y.a.a(ab.f76385a, 1, 66667);
        b(((ProfileNaviCreatorState) k().a(this)).getProfileImageBackgroundColor());
        NaviGLSurfaceView e2 = e();
        if (e2 != null && (naviManager = e2.getNaviManager()) != null) {
            naviManager.a(a2.f76615a, a2.f76617c, a2.f76617c, a2.f76616b);
        }
    }

    public final void m() {
        com.ss.android.ugc.aweme.view.customView.a naviManager;
        NaviGLSurfaceView e2;
        com.ss.android.ugc.aweme.view.customView.a naviManager2;
        MethodCollector.i(2933);
        h();
        NaviGLSurfaceView e3 = e();
        if (e3 == null || (naviManager = e3.getNaviManager()) == null) {
            MethodCollector.o(2933);
            return;
        }
        if (!(!naviManager.t || (e2 = e()) == null || (naviManager2 = e2.getNaviManager()) == null)) {
            naviManager2.f144172a.lock();
            naviManager2.t = false;
            List<ByteArrayOutputStream> list = naviManager2.w;
            naviManager2.w = null;
            naviManager2.f144172a.unlock();
            if (list != null) {
                try {
                    if (list.size() < 40) {
                        k().h();
                        MethodCollector.o(2933);
                        return;
                    }
                    int i2 = naviManager.r;
                    File a2 = u.a(getContext(), u.a.WEBP);
                    if (a2 == null) {
                        MethodCollector.o(2933);
                        return;
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(a2);
                    com.ss.android.ugc.aweme.common.t tVar = new com.ss.android.ugc.aweme.common.t(fileOutputStream, naviManager.u, naviManager.v);
                    tVar.f76483a = i2;
                    tVar.a(new byte[]{82, 73, 70, 70}, 4);
                    tVar.b(0);
                    tVar.a(new byte[]{87, 69, 66, 80}, 4);
                    tVar.a(new byte[]{86, 80, 56, 88}, 4);
                    tVar.b(10);
                    BitSet bitSet = new BitSet(8);
                    bitSet.set(0, false);
                    bitSet.set(1, true);
                    bitSet.set(2, false);
                    bitSet.set(3, false);
                    bitSet.set(4, true);
                    byte[] byteArray = bitSet.toByteArray();
                    l.b(byteArray, "");
                    tVar.a(byteArray, byteArray.length);
                    tVar.a(0);
                    tVar.a(tVar.f76486d - 1);
                    tVar.a(tVar.f76487e - 1);
                    tVar.a(new byte[]{65, 78, 73, 77}, 4);
                    tVar.b(6);
                    tVar.b(0);
                    byte[] array = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(tVar.f76484b).array();
                    l.b(array, "");
                    tVar.a(array, 2);
                    for (ByteArrayOutputStream byteArrayOutputStream : list) {
                        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                        l.b(byteArray2, "");
                        tVar.a(byteArray2);
                        byteArrayOutputStream.close();
                    }
                    long position = tVar.f76485c.getChannel().position();
                    tVar.f76485c.getChannel().position(4L);
                    tVar.b(((int) position) - 8);
                    fileOutputStream.close();
                    hx.a(0, new g(this, a2));
                    k().h();
                    MethodCollector.o(2933);
                    return;
                } catch (FileNotFoundException e4) {
                    k().h();
                    e4.printStackTrace();
                    MethodCollector.o(2933);
                    return;
                } catch (IOException e5) {
                    k().h();
                    e5.printStackTrace();
                    MethodCollector.o(2933);
                    return;
                }
            }
        }
        k().h();
        MethodCollector.o(2933);
    }

    public final void b(String str) {
        try {
            NaviGLSurfaceView e2 = e();
            if (!hl.a(str)) {
                k();
                q qVar = r.f110811a;
                if (qVar != null) {
                    str = qVar.f110806b;
                } else {
                    str = null;
                }
            }
            int parseColor = Color.parseColor(str);
            if (e2 != null) {
                com.ss.android.ugc.aweme.view.customView.a naviManager = e2.getNaviManager();
                if (naviManager != null) {
                    naviManager.f144182k = ((float) Color.red(parseColor)) / 256.0f;
                }
                com.ss.android.ugc.aweme.view.customView.a naviManager2 = e2.getNaviManager();
                if (naviManager2 != null) {
                    naviManager2.f144184m = ((float) Color.blue(parseColor)) / 256.0f;
                }
                com.ss.android.ugc.aweme.view.customView.a naviManager3 = e2.getNaviManager();
                if (naviManager3 != null) {
                    naviManager3.f144183l = ((float) Color.green(parseColor)) / 256.0f;
                }
                com.ss.android.ugc.aweme.view.customView.a naviManager4 = e2.getNaviManager();
                if (naviManager4 != null) {
                    naviManager4.n = 1.0f;
                }
            }
        } catch (Exception e3) {
            e3.getMessage();
        }
    }

    static final class c extends m implements h.f.a.m<com.bytedance.jedi.arch.i, String, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, String str) {
            String str2 = str;
            l.d(iVar, "");
            if (str2 != null) {
                String str3 = this.this$0.f144237b;
                l.d(str2, "");
                l.d(str3, "");
                com.ss.android.ugc.aweme.common.r.a("edit_set_avatar_profile", new com.ss.android.ugc.aweme.app.f.d().a("item_tab", "background").a(com.bytedance.ies.xelement.pickview.b.b.f37372a, str2).a("enter_from", str3).f66730a);
                this.this$0.b(str2);
            }
            return z.f158842a;
        }
    }

    static final class d extends m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94409);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            com.bytedance.jedi.arch.i iVar2 = iVar;
            boolean booleanValue = bool.booleanValue();
            l.d(iVar2, "");
            if (booleanValue) {
                if (((ProfileNaviEditorState) this.this$0.a().a(iVar2)).getNaviDoneLoading()) {
                    this.this$0.l();
                } else {
                    this.this$0.f144238c = true;
                    this.this$0.a(new Runnable(this) {
                        /* class com.ss.android.ugc.aweme.view.f.a.d.AnonymousClass1 */

                        /* renamed from: a  reason: collision with root package name */
                        final /* synthetic */ d f144242a;

                        static {
                            Covode.recordClassIndex(94410);
                        }

                        {
                            this.f144242a = r1;
                        }

                        public final void run() {
                            this.f144242a.this$0.l();
                        }
                    }, 3000);
                }
            }
            return z.f158842a;
        }
    }

    static final class e extends m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94411);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            com.ss.android.ugc.aweme.view.customView.a naviManager;
            NaviGLSurfaceView e2;
            boolean booleanValue = bool.booleanValue();
            l.d(iVar, "");
            if (booleanValue) {
                a aVar = this.this$0;
                aVar.h();
                NaviGLSurfaceView e3 = aVar.e();
                if (!(e3 == null || (naviManager = e3.getNaviManager()) == null || naviManager.t || (e2 = aVar.e()) == null)) {
                    e2.queueEvent(new h(aVar));
                }
            } else {
                this.this$0.m();
            }
            return z.f158842a;
        }
    }

    static final class f extends m implements h.f.a.m<com.bytedance.jedi.arch.i, Boolean, z> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(94412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(a aVar) {
            super(2);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final /* synthetic */ z invoke(com.bytedance.jedi.arch.i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            l.d(iVar, "");
            if (booleanValue && this.this$0.f144238c) {
                this.this$0.f144238c = false;
                this.this$0.h();
                this.this$0.l();
            }
            return z.f158842a;
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.view.customView.b
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        l.d(layoutInflater, "");
        String str = this.f144237b;
        l.d(str, "");
        com.ss.android.ugc.aweme.common.r.a("show_set_avatar_profile", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str).f66730a);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
