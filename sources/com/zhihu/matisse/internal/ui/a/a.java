package com.zhihu.matisse.internal.ui.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.profile.ai;
import com.ss.android.ugc.aweme.utils.gg;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.entity.c;
import com.zhihu.matisse.internal.ui.widget.MediaGrid;
import com.zhiliaoapp.musically.R;

public final class a extends d<RecyclerView.ViewHolder> implements MediaGrid.a {

    /* renamed from: a  reason: collision with root package name */
    public b f156463a;

    /* renamed from: b  reason: collision with root package name */
    public d f156464b;

    /* renamed from: d  reason: collision with root package name */
    private final com.zhihu.matisse.internal.b.c f156465d;

    /* renamed from: e  reason: collision with root package name */
    private final Drawable f156466e;

    /* renamed from: f  reason: collision with root package name */
    private com.zhihu.matisse.internal.entity.c f156467f = c.a.f156445a;

    /* renamed from: g  reason: collision with root package name */
    private RecyclerView f156468g;

    /* renamed from: h  reason: collision with root package name */
    private int f156469h;

    public interface b {
        static {
            Covode.recordClassIndex(103899);
        }

        void b();
    }

    public interface d {
        static {
            Covode.recordClassIndex(103901);
        }

        void a(Album album, Item item, int i2);
    }

    public interface e {
        static {
            Covode.recordClassIndex(103902);
        }

        void d();
    }

    static {
        Covode.recordClassIndex(103896);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return a(this, viewGroup, i2);
    }

    private void a() {
        notifyDataSetChanged();
        b bVar = this.f156463a;
        if (bVar != null) {
            bVar.b();
        }
    }

    /* access modifiers changed from: package-private */
    public static class c extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public MediaGrid f156472a;

        static {
            Covode.recordClassIndex(103900);
        }

        c(View view) {
            super(view);
            this.f156472a = (MediaGrid) view;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.zhihu.matisse.internal.ui.a.a$a  reason: collision with other inner class name */
    public static class C4130a extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public TextView f156471a;

        static {
            Covode.recordClassIndex(103898);
        }

        C4130a(View view) {
            super(view);
            this.f156471a = (TextView) view.findViewById(R.id.bg8);
        }
    }

    @Override // com.zhihu.matisse.internal.ui.a.d
    public final int a(Cursor cursor) {
        if (Item.a(cursor).f156421a == -1) {
            return 1;
        }
        return 2;
    }

    private boolean a(Context context, Item item) {
        com.zhihu.matisse.internal.entity.b d2 = this.f156465d.d(item);
        com.zhihu.matisse.internal.entity.b.a(context, d2);
        if (d2 == null) {
            return true;
        }
        return false;
    }

    @Override // com.zhihu.matisse.internal.ui.widget.MediaGrid.a
    public final void a(Item item, RecyclerView.ViewHolder viewHolder) {
        d dVar = this.f156464b;
        if (dVar != null) {
            dVar.a(null, item, viewHolder.getAdapterPosition());
        }
    }

    @Override // com.zhihu.matisse.internal.ui.widget.MediaGrid.a
    public final void b(Item item, RecyclerView.ViewHolder viewHolder) {
        if (this.f156467f.f156437f) {
            if (this.f156465d.e(item) != Integer.MIN_VALUE) {
                this.f156465d.b(item);
                a();
            } else if (a(viewHolder.itemView.getContext(), item)) {
                this.f156465d.a(item);
                a();
            }
        } else if (this.f156465d.c(item)) {
            this.f156465d.b(item);
            a();
        } else if (a(viewHolder.itemView.getContext(), item)) {
            this.f156465d.a(item);
            a();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.zhihu.matisse.internal.ui.a.d
    public final void a(RecyclerView.ViewHolder viewHolder, Cursor cursor) {
        int i2;
        Drawable.ConstantState constantState;
        if (viewHolder instanceof C4130a) {
            C4130a aVar = (C4130a) viewHolder;
            Drawable[] compoundDrawables = aVar.f156471a.getCompoundDrawables();
            TypedArray obtainStyledAttributes = viewHolder.itemView.getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.mf});
            int color = obtainStyledAttributes.getColor(0, 0);
            obtainStyledAttributes.recycle();
            for (int i3 = 0; i3 < compoundDrawables.length; i3++) {
                Drawable drawable = compoundDrawables[i3];
                if (!(drawable == null || (constantState = drawable.getConstantState()) == null)) {
                    Drawable mutate = constantState.newDrawable().mutate();
                    mutate.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                    mutate.setBounds(drawable.getBounds());
                    compoundDrawables[i3] = mutate;
                }
            }
            aVar.f156471a.setCompoundDrawables(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
        } else if (viewHolder instanceof c) {
            c cVar = (c) viewHolder;
            Item a2 = Item.a(cursor);
            MediaGrid mediaGrid = cVar.f156472a;
            Context context = cVar.f156472a.getContext();
            if (this.f156469h == 0) {
                int i4 = ((GridLayoutManager) this.f156468g.getLayoutManager()).f3760b;
                int dimensionPixelSize = (context.getResources().getDisplayMetrics().widthPixels - (context.getResources().getDimensionPixelSize(R.dimen.ol) * (i4 - 1))) / i4;
                this.f156469h = dimensionPixelSize;
                this.f156469h = (int) (((float) dimensionPixelSize) * this.f156467f.o);
            }
            mediaGrid.f156510f = new MediaGrid.b(this.f156469h, this.f156466e, this.f156467f.f156437f, viewHolder);
            MediaGrid mediaGrid2 = cVar.f156472a;
            mediaGrid2.f156509e = a2;
            ImageView imageView = mediaGrid2.f156507c;
            if (mediaGrid2.f156509e.b()) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            imageView.setVisibility(i2);
            mediaGrid2.f156506b.setCountable(mediaGrid2.f156510f.f156514c);
            com.facebook.imagepipeline.o.c a3 = com.facebook.imagepipeline.o.c.a(mediaGrid2.f156509e.f156423c);
            a3.f48447d = new com.facebook.imagepipeline.common.d(mediaGrid2.f156510f.f156512a, mediaGrid2.f156510f.f156512a);
            REQUEST request = (REQUEST) a3.a();
            if (mediaGrid2.f156509e.b()) {
                com.facebook.drawee.a.a.e b2 = com.facebook.drawee.a.a.c.b();
                b2.f47325m = mediaGrid2.f156505a.getController();
                b2.f47315c = request;
                b2.f47322j = true;
                mediaGrid2.f156505a.setController(b2.e());
            } else {
                mediaGrid2.f156505a.setImageRequest(request);
            }
            if (mediaGrid2.f156509e.c()) {
                mediaGrid2.f156508d.setVisibility(0);
                mediaGrid2.f156508d.setText(DateUtils.formatElapsedTime(mediaGrid2.f156509e.f156425e / 1000));
            } else {
                mediaGrid2.f156508d.setVisibility(8);
            }
            cVar.f156472a.setOnMediaGridClickListener(this);
            MediaGrid mediaGrid3 = cVar.f156472a;
            if (this.f156467f.f156437f) {
                int e2 = this.f156465d.e(a2);
                if (e2 > 0 || !this.f156465d.d()) {
                    mediaGrid3.setCheckEnabled(true);
                    mediaGrid3.setCheckedNum(e2);
                    return;
                }
                mediaGrid3.setCheckEnabled(false);
                mediaGrid3.setCheckedNum(Integer.MIN_VALUE);
            } else if (this.f156465d.c(a2)) {
                mediaGrid3.setCheckEnabled(true);
                mediaGrid3.setChecked(true);
            } else if (this.f156465d.d()) {
                mediaGrid3.setCheckEnabled(false);
                mediaGrid3.setChecked(false);
            } else {
                mediaGrid3.setCheckEnabled(true);
                mediaGrid3.setChecked(false);
            }
        }
    }

    public a(Context context, com.zhihu.matisse.internal.b.c cVar, RecyclerView recyclerView) {
        this.f156465d = cVar;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.xs});
        this.f156466e = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        this.f156468g = recyclerView;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: com.zhihu.matisse.internal.ui.a.a$a */
    /* JADX WARN: Multi-variable type inference failed */
    private static RecyclerView.ViewHolder a(a aVar, ViewGroup viewGroup, int i2) {
        c cVar;
        MethodCollector.i(3645);
        boolean z = true;
        if (i2 == 1) {
            C4130a aVar2 = new C4130a(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.amv, viewGroup, false));
            aVar2.itemView.setOnClickListener(new View.OnClickListener() {
                /* class com.zhihu.matisse.internal.ui.a.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(103897);
                }

                public final void onClick(View view) {
                    if (view.getContext() instanceof e) {
                        ((e) view.getContext()).d();
                    }
                }
            });
            cVar = aVar2;
        } else if (i2 == 2) {
            cVar = new c(com.a.a(LayoutInflater.from(viewGroup.getContext()), R.layout.akc, viewGroup, false));
        } else {
            cVar = null;
        }
        try {
            if (cVar.itemView.getParent() != null) {
                try {
                    z = SettingsManager.a().a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(cVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i2);
                    com.bytedance.services.apm.api.a.a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) cVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(cVar.itemView);
                    }
                }
            }
        } catch (Exception e2) {
            ai.a(e2);
            com.ss.android.ugc.aweme.framework.a.a.a(e2);
        }
        gg.f143005a = cVar.getClass().getName();
        MethodCollector.o(3645);
        return cVar;
    }
}
