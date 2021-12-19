package com.ss.android.ugc.aweme.editSticker.text.als;

import android.content.Context;
import android.text.TextWatcher;
import android.view.ViewGroup;
import androidx.lifecycle.t;
import b.i;
import com.bytedance.als.b;
import com.bytedance.als.h;
import com.bytedance.als.k;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.ss.android.ugc.aweme.editSticker.compile.TextStickerCompileResult;
import com.ss.android.ugc.aweme.editSticker.d.e;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.c.d;
import com.ss.android.ugc.aweme.editSticker.text.view.q;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import h.f.a.m;
import h.p;
import h.z;
import java.util.List;

public interface a extends b {
    static {
        Covode.recordClassIndex(55575);
    }

    i<List<TextStickerCompileResult>> a(com.ss.android.ugc.aweme.editSticker.compile.a aVar, ViewGroup viewGroup);

    k<z> a();

    List<InteractStickerStruct> a(Context context, List<? extends StickerItemModel> list, f fVar);

    void a(int i2);

    void a(TextWatcher textWatcher);

    void a(t<Boolean> tVar);

    void a(e eVar);

    void a(d dVar);

    void a(com.ss.android.ugc.aweme.editSticker.text.c.e eVar);

    void a(h.f.a.b<? super q, z> bVar);

    void a(m<? super q, ? super q, z> mVar);

    void a(p<Integer, Integer> pVar);

    void a(boolean z);

    k<p<Boolean, Boolean>> b();

    void b(h.f.a.b<? super q, z> bVar);

    void b(boolean z);

    k<Boolean> c();

    void c(boolean z);

    void d(boolean z);

    void e(boolean z);

    boolean e();

    void f();

    void g();

    void h();

    boolean i();

    void j();

    void k();

    void l();

    void m();

    boolean n();

    boolean o();

    boolean p();

    com.ss.android.ugc.aweme.editSticker.interact.d q();

    List<q> r();

    h<Boolean> s();

    void t();
}
