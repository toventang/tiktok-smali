package com.zhihu.matisse.internal.ui;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.zhihu.matisse.internal.b.b;
import com.zhihu.matisse.internal.b.c;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.entity.c;
import com.zhihu.matisse.internal.ui.a.a;
import com.zhiliaoapp.musically.R;

public class b extends Fragment implements b.a, a.b, a.d {

    /* renamed from: a  reason: collision with root package name */
    public com.zhihu.matisse.internal.ui.a.a f156478a;

    /* renamed from: b  reason: collision with root package name */
    private final com.zhihu.matisse.internal.b.b f156479b = new com.zhihu.matisse.internal.b.b();

    /* renamed from: c  reason: collision with root package name */
    private RecyclerView f156480c;

    /* renamed from: d  reason: collision with root package name */
    private a f156481d;

    /* renamed from: e  reason: collision with root package name */
    private a.b f156482e;

    /* renamed from: f  reason: collision with root package name */
    private a.d f156483f;

    public interface a {
        static {
            Covode.recordClassIndex(103908);
        }

        c c();
    }

    static {
        Covode.recordClassIndex(103907);
    }

    @Override // com.zhihu.matisse.internal.b.b.a
    public final void a() {
        this.f156478a.b(null);
    }

    @Override // com.zhihu.matisse.internal.ui.a.a.b
    public final void b() {
        a.b bVar = this.f156482e;
        if (bVar != null) {
            bVar.b();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f156479b.b();
    }

    @Override // com.zhihu.matisse.internal.b.b.a
    public final void a(Cursor cursor) {
        this.f156478a.b(cursor);
    }

    public static b a(Album album) {
        b bVar = new b();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_album", album);
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof a) {
            this.f156481d = (a) context;
            if (context instanceof a.b) {
                this.f156482e = (a.b) context;
            }
            if (context instanceof a.d) {
                this.f156483f = (a.d) context;
                return;
            }
            return;
        }
        throw new IllegalStateException("Context must implement SelectionProvider.");
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Album album = (Album) getArguments().getParcelable("extra_album");
        com.zhihu.matisse.internal.ui.a.a aVar = new com.zhihu.matisse.internal.ui.a.a(getContext(), this.f156481d.c(), this.f156480c);
        this.f156478a = aVar;
        aVar.f156463a = this;
        this.f156478a.f156464b = this;
        int i2 = 1;
        this.f156480c.setHasFixedSize(true);
        com.zhihu.matisse.internal.entity.c cVar = c.a.f156445a;
        if (cVar.n > 0) {
            int round = Math.round(((float) getContext().getResources().getDisplayMetrics().widthPixels) / ((float) cVar.n));
            if (round != 0) {
                i2 = round;
            }
        } else {
            i2 = cVar.f156444m;
        }
        RecyclerView recyclerView = this.f156480c;
        getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(i2));
        this.f156480c.a(new com.zhihu.matisse.internal.ui.widget.c(i2, getResources().getDimensionPixelSize(R.dimen.ol)));
        this.f156480c.setAdapter(this.f156478a);
        this.f156479b.a(getActivity(), this);
        this.f156479b.a(album, cVar.f156442k);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f156480c = (RecyclerView) view.findViewById(R.id.djv);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return com.a.a(layoutInflater, R.layout.a15, viewGroup, false);
    }

    @Override // com.zhihu.matisse.internal.ui.a.a.d
    public final void a(Album album, Item item, int i2) {
        a.d dVar = this.f156483f;
        if (dVar != null) {
            dVar.a((Album) getArguments().getParcelable("extra_album"), item, i2);
        }
    }
}
