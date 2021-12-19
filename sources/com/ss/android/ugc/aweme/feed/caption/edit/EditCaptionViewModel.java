package com.ss.android.ugc.aweme.feed.caption.edit;

import androidx.lifecycle.ac;
import androidx.lifecycle.t;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import h.f.b.l;
import h.f.b.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class EditCaptionViewModel extends ac {

    /* renamed from: a  reason: collision with root package name */
    public EditCaptionItem f92794a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f92795b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final h.h f92796c = h.i.a((h.f.a.a) a.f92801a);

    /* renamed from: d  reason: collision with root package name */
    private final h.h f92797d = h.i.a((h.f.a.a) g.f92807a);

    /* renamed from: e  reason: collision with root package name */
    private final h.h f92798e = h.i.a((h.f.a.a) h.f92808a);

    /* renamed from: f  reason: collision with root package name */
    private final h.h f92799f = h.i.a((h.f.a.a) f.f92806a);

    /* renamed from: g  reason: collision with root package name */
    private final h.h f92800g = h.i.a((h.f.a.a) i.f92809a);

    static {
        Covode.recordClassIndex(58855);
    }

    public final t<Aweme> a() {
        return (t) this.f92796c.getValue();
    }

    public final t<String> b() {
        return (t) this.f92798e.getValue();
    }

    public final t<Integer> c() {
        return (t) this.f92799f.getValue();
    }

    public final t<Integer> d() {
        return (t) this.f92800g.getValue();
    }

    static final class a extends m implements h.f.a.a<t<Aweme>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f92801a = new a();

        static {
            Covode.recordClassIndex(58856);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Aweme> invoke() {
            return new t();
        }
    }

    static final class f extends m implements h.f.a.a<t<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f92806a = new f();

        static {
            Covode.recordClassIndex(58861);
        }

        f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Integer> invoke() {
            t tVar = new t();
            tVar.setValue(-1);
            return tVar;
        }
    }

    static final class g extends m implements h.f.a.a<t<Boolean>> {

        /* renamed from: a  reason: collision with root package name */
        public static final g f92807a = new g();

        static {
            Covode.recordClassIndex(58862);
        }

        g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Boolean> invoke() {
            t tVar = new t();
            tVar.setValue(false);
            return tVar;
        }
    }

    static final class h extends m implements h.f.a.a<t<String>> {

        /* renamed from: a  reason: collision with root package name */
        public static final h f92808a = new h();

        static {
            Covode.recordClassIndex(58863);
        }

        h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<String> invoke() {
            t tVar = new t();
            tVar.setValue("");
            return tVar;
        }
    }

    static final class i extends m implements h.f.a.a<t<Integer>> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f92809a = new i();

        static {
            Covode.recordClassIndex(58864);
        }

        i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ t<Integer> invoke() {
            t tVar = new t();
            tVar.setValue(-1);
            return tVar;
        }
    }

    static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionViewModel f92803a;

        static {
            Covode.recordClassIndex(58858);
        }

        c(EditCaptionViewModel editCaptionViewModel) {
            this.f92803a = editCaptionViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            l.d(obj, "");
            this.f92803a.a().setValue(null);
        }
    }

    static final class j<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionViewModel f92810a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f92811b;

        static {
            Covode.recordClassIndex(58865);
        }

        j(EditCaptionViewModel editCaptionViewModel, String str) {
            this.f92810a = editCaptionViewModel;
            this.f92811b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Integer num;
            BaseResponse baseResponse = (BaseResponse) obj;
            t<Integer> d2 = this.f92810a.d();
            if (baseResponse != null) {
                num = Integer.valueOf(baseResponse.status_code);
            } else {
                num = null;
            }
            d2.setValue(num);
        }
    }

    static final class k<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionViewModel f92812a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f92813b;

        static {
            Covode.recordClassIndex(58866);
        }

        k(EditCaptionViewModel editCaptionViewModel, String str) {
            this.f92812a = editCaptionViewModel;
            this.f92813b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                this.f92812a.d().setValue(Integer.valueOf(((com.ss.android.ugc.aweme.base.api.a.a) th).getErrorCode()));
            }
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionViewModel f92805a;

        static {
            Covode.recordClassIndex(58860);
        }

        e(EditCaptionViewModel editCaptionViewModel) {
            this.f92805a = editCaptionViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            l.d(th, "");
            this.f92805a.a().setValue(null);
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                this.f92805a.c().setValue(Integer.valueOf(((com.ss.android.ugc.aweme.base.api.a.a) th).getErrorCode()));
            }
        }
    }

    static final class b<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionViewModel f92802a;

        static {
            Covode.recordClassIndex(58857);
        }

        b(EditCaptionViewModel editCaptionViewModel) {
            this.f92802a = editCaptionViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<CaptionData> list;
            List<CaptionData> list2;
            Aweme aweme;
            String str;
            List<CaptionData> transSubtitle;
            EdtCaptionModel edtCaptionModel = (EdtCaptionModel) obj;
            EditCaptionViewModel editCaptionViewModel = this.f92802a;
            Integer num = null;
            if (edtCaptionModel != null) {
                list = edtCaptionModel.getTransSubtitle();
                list2 = edtCaptionModel.getSrcSubtitle();
            } else {
                list = null;
                list2 = null;
            }
            editCaptionViewModel.f92794a = new EditCaptionItem(list, list2);
            if (!(edtCaptionModel == null || (transSubtitle = edtCaptionModel.getTransSubtitle()) == null)) {
                Iterator<T> it = transSubtitle.iterator();
                while (it.hasNext()) {
                    this.f92802a.f92795b.add(it.next().getText());
                }
            }
            t<Aweme> a2 = this.f92802a.a();
            if (edtCaptionModel != null) {
                aweme = edtCaptionModel.getAweme();
            } else {
                aweme = null;
            }
            a2.setValue(aweme);
            t<String> b2 = this.f92802a.b();
            if (edtCaptionModel != null) {
                str = edtCaptionModel.getNewSubtitleId();
            } else {
                str = null;
            }
            b2.setValue(str);
            t<Integer> c2 = this.f92802a.c();
            if (edtCaptionModel != null) {
                num = Integer.valueOf(edtCaptionModel.status_code);
            }
            c2.setValue(num);
        }
    }

    static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ EditCaptionViewModel f92804a;

        static {
            Covode.recordClassIndex(58859);
        }

        d(EditCaptionViewModel editCaptionViewModel) {
            this.f92804a = editCaptionViewModel;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            List<CaptionData> list;
            List<CaptionData> list2;
            Aweme aweme;
            List<CaptionData> transSubtitle;
            EdtCaptionModel edtCaptionModel = (EdtCaptionModel) obj;
            EditCaptionViewModel editCaptionViewModel = this.f92804a;
            Integer num = null;
            if (edtCaptionModel != null) {
                list = edtCaptionModel.getTransSubtitle();
                list2 = edtCaptionModel.getSrcSubtitle();
            } else {
                list = null;
                list2 = null;
            }
            editCaptionViewModel.f92794a = new EditCaptionItem(list, list2);
            if (!(edtCaptionModel == null || (transSubtitle = edtCaptionModel.getTransSubtitle()) == null)) {
                Iterator<T> it = transSubtitle.iterator();
                while (it.hasNext()) {
                    this.f92804a.f92795b.add(it.next().getText());
                }
            }
            t<Aweme> a2 = this.f92804a.a();
            if (edtCaptionModel != null) {
                aweme = edtCaptionModel.getAweme();
            } else {
                aweme = null;
            }
            a2.setValue(aweme);
            t<Integer> c2 = this.f92804a.c();
            if (edtCaptionModel != null) {
                num = Integer.valueOf(edtCaptionModel.status_code);
            }
            c2.setValue(num);
        }
    }
}
