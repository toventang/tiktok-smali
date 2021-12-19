package com.ss.android.ugc.aweme.emoji.emojichoose;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.e;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.emoji.b.d;
import com.ss.android.ugc.aweme.emoji.sysemoji.i;
import com.ss.android.ugc.aweme.emoji.utils.c;
import com.ss.android.ugc.aweme.emoji.utils.h;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public View f89232a;

    /* renamed from: b  reason: collision with root package name */
    public GridView f89233b;

    /* renamed from: c  reason: collision with root package name */
    public int f89234c;

    /* renamed from: d  reason: collision with root package name */
    private Context f89235d;

    /* renamed from: e  reason: collision with root package name */
    private ViewGroup f89236e;

    /* renamed from: f  reason: collision with root package name */
    private a f89237f;

    static {
        Covode.recordClassIndex(56093);
    }

    /* access modifiers changed from: package-private */
    public final class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        public List<com.ss.android.ugc.aweme.emoji.b.a> f89238a = new ArrayList();

        static {
            Covode.recordClassIndex(56094);
        }

        public final long getItemId(int i2) {
            return (long) i2;
        }

        public final int getCount() {
            return this.f89238a.size();
        }

        public final Object getItem(int i2) {
            return this.f89238a.get(i2);
        }

        a() {
        }

        public final View getView(int i2, View view, ViewGroup viewGroup) {
            b bVar;
            com.ss.android.ugc.aweme.emoji.b.a aVar = this.f89238a.get(i2);
            if (view != null && aVar != null && aVar.equals(view.getTag(R.id.c3r))) {
                return view;
            }
            if (view == null) {
                LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
                int i3 = f.this.f89234c;
                int i4 = R.layout.yi;
                if (i3 == 1) {
                    i4 = R.layout.yo;
                } else if (f.this.f89234c == 5) {
                    i4 = i2 == this.f89238a.size() - 1 ? R.layout.yt : R.layout.yq;
                } else if (f.this.f89234c == 4 && this.f89238a.get(i2).f89103a == 2131231993) {
                    i4 = R.layout.yn;
                }
                view = com.a.a(from, i4, viewGroup, false);
                bVar = new b(view);
                view.setTag(R.id.c3q, bVar);
            } else {
                bVar = (b) view.getTag(R.id.c3q);
            }
            view.setTag(R.id.c3r, aVar);
            bVar.a(aVar);
            return view;
        }
    }

    final class b extends d<com.ss.android.ugc.aweme.emoji.b.a> {

        /* renamed from: b  reason: collision with root package name */
        private RemoteImageView f89241b;

        /* renamed from: c  reason: collision with root package name */
        private TextView f89242c;

        /* renamed from: d  reason: collision with root package name */
        private TextView f89243d;

        static {
            Covode.recordClassIndex(56095);
        }

        @Override // com.ss.android.ugc.aweme.emoji.b.d
        public final void b() {
        }

        @Override // com.ss.android.ugc.aweme.emoji.b.d
        public final void a() {
            this.f89242c = (TextView) this.itemView.findViewById(R.id.avi);
            this.f89241b = (RemoteImageView) this.itemView.findViewById(R.id.av9);
            this.f89243d = (TextView) this.itemView.findViewById(R.id.title_tv);
        }

        private void c(com.ss.android.ugc.aweme.emoji.b.a aVar) {
            com.ss.android.ugc.aweme.emoji.g.a aVar2 = aVar.f89106d;
            if (com.ss.android.ugc.aweme.emoji.d.a.a.d(aVar2)) {
                h.a(this.f89241b, aVar2.getStaticUrl(), null);
            } else {
                e.a(this.f89241b, aVar2.getStaticUrl());
            }
        }

        private boolean f(com.ss.android.ugc.aweme.emoji.b.a aVar) {
            if (!aVar.a()) {
                return false;
            }
            if (f.this.f89234c == 2) {
                return true;
            }
            if (f.this.f89234c == 4 && aVar.f89103a == 2131231993) {
                return true;
            }
            return false;
        }

        private void d(com.ss.android.ugc.aweme.emoji.b.a aVar) {
            File file = new File(c.a(), c.c(aVar.f89106d));
            if (file.exists()) {
                a(file.getAbsolutePath(), com.ss.android.ugc.aweme.emoji.d.a.a.d(aVar.f89106d));
                return;
            }
            c(aVar);
        }

        private void e(com.ss.android.ugc.aweme.emoji.b.a aVar) {
            TextView textView = this.f89243d;
            if (textView != null) {
                textView.setVisibility(0);
                if (f(aVar)) {
                    this.f89243d.setText(com.ss.android.ugc.aweme.emoji.d.a.a.b(aVar.f89106d));
                } else {
                    this.f89243d.setText("");
                }
            }
        }

        private void b(com.ss.android.ugc.aweme.emoji.b.a aVar) {
            TextView textView = this.f89243d;
            if (textView != null) {
                textView.setText("");
            }
            if (this.f89241b == null) {
                return;
            }
            if (!aVar.a() || aVar.f89106d.getStaticUrl() == null) {
                ((com.facebook.drawee.f.a) this.f89241b.getHierarchy()).a(5, (Drawable) null);
                ((com.facebook.drawee.f.a) this.f89241b.getHierarchy()).a(1, (Drawable) null);
                return;
            }
            ((com.facebook.drawee.f.a) this.f89241b.getHierarchy()).d(R.drawable.a7t);
            ((com.facebook.drawee.f.a) this.f89241b.getHierarchy()).c(R.drawable.a7t);
        }

        public final void a(com.ss.android.ugc.aweme.emoji.b.a aVar) {
            if (aVar != null) {
                b(aVar);
                Context context = this.itemView.getContext();
                if (!aVar.a() || !(aVar.f89106d instanceof i)) {
                    if (aVar.a()) {
                        a(context, aVar);
                    } else if (!TextUtils.isEmpty(aVar.f89105c) || aVar.f89103a > 0 || !TextUtils.isEmpty(aVar.f89104b)) {
                        b(context, aVar);
                    } else {
                        RemoteImageView remoteImageView = this.f89241b;
                        if (remoteImageView != null) {
                            remoteImageView.setVisibility(8);
                        }
                        TextView textView = this.f89243d;
                        if (textView != null) {
                            textView.setVisibility(8);
                        }
                        TextView textView2 = this.f89242c;
                        if (textView2 != null) {
                            textView2.setVisibility(8);
                        }
                    }
                } else if (aVar.f89103a > 0) {
                    b(context, aVar);
                } else {
                    c(context, aVar);
                }
                e(aVar);
            }
        }

        b(View view) {
            super(view);
        }

        private void a(String str, boolean z) {
            String concat = "file://".concat(String.valueOf(str));
            if (z) {
                h.a(this.f89241b, concat);
            } else {
                e.b(this.f89241b, concat, -1, -1);
            }
        }

        private void a(Context context, int i2) {
            e.b(this.f89241b, "res://" + context.getPackageName() + "/" + i2, -1, -1);
        }

        private void b(Context context, com.ss.android.ugc.aweme.emoji.b.a aVar) {
            RemoteImageView remoteImageView = this.f89241b;
            if (remoteImageView != null) {
                remoteImageView.setVisibility(0);
                com.ss.android.ugc.aweme.emoji.i.b.b.a(this.f89241b, aVar);
                this.f89241b.setContentDescription(context.getString(R.string.bmn, aVar.f89105c));
            }
        }

        private void c(Context context, com.ss.android.ugc.aweme.emoji.b.a aVar) {
            TextView textView = this.f89242c;
            if (textView != null) {
                textView.setVisibility(0);
                this.f89242c.setText(((i) aVar.f89106d).getPreviewEmoji());
                this.f89242c.setContentDescription(context.getString(R.string.bmn, aVar.f89105c));
            }
        }

        private void a(Context context, com.ss.android.ugc.aweme.emoji.b.a aVar) {
            RemoteImageView remoteImageView = this.f89241b;
            if (remoteImageView != null) {
                remoteImageView.setVisibility(0);
                this.f89241b.setDrawingCacheEnabled(true);
                if (aVar.f89106d.getStickerType() == 2) {
                    if (aVar.f89103a == 2131231984) {
                        a(context, aVar.f89103a);
                    } else {
                        d(aVar);
                    }
                    this.f89241b.setContentDescription(context.getString(R.string.bmq));
                } else if (aVar.f89106d.getStickerType() != 10) {
                    String a2 = c.a(aVar.f89106d);
                    if (new File(a2).exists()) {
                        a(a2, com.ss.android.ugc.aweme.emoji.d.a.a.d(aVar.f89106d));
                    } else {
                        c(aVar);
                    }
                    if (!TextUtils.isEmpty(aVar.f89105c)) {
                        this.f89241b.setContentDescription(context.getString(R.string.bmn, aVar.f89105c));
                    }
                } else if (aVar.f89103a == 2131231993) {
                    a(context, aVar.f89103a);
                    this.f89241b.setContentDescription(context.getString(R.string.bmp));
                } else {
                    c(aVar);
                    this.f89241b.setContentDescription(context.getString(R.string.bmo));
                }
            }
        }
    }

    public final void a(List<com.ss.android.ugc.aweme.emoji.b.a> list) {
        a aVar = this.f89237f;
        aVar.f89238a.clear();
        aVar.f89238a.addAll(list);
        this.f89237f.notifyDataSetChanged();
    }

    public f(ViewGroup viewGroup, int i2) {
        Context context = viewGroup.getContext();
        this.f89235d = context;
        this.f89234c = i2;
        this.f89236e = viewGroup;
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.z3, this.f89236e, false);
        this.f89232a = a2;
        GridView gridView = (GridView) a2.findViewById(R.id.avb);
        this.f89233b = gridView;
        gridView.setSelector(R.color.c9);
        this.f89233b.setStretchMode(1);
        this.f89233b.setGravity(17);
        Resources resources = this.f89235d.getResources();
        int i3 = this.f89234c;
        if (i3 == 1 || i3 == 5) {
            this.f89233b.setNumColumns(7);
            this.f89233b.setColumnWidth(resources.getDimensionPixelSize(R.dimen.jg));
            this.f89233b.setVerticalSpacing(resources.getDimensionPixelSize(R.dimen.jj));
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.ji);
            this.f89233b.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        } else {
            this.f89233b.setNumColumns(4);
            this.f89233b.setColumnWidth(resources.getDimensionPixelSize(R.dimen.ja));
            this.f89233b.setVerticalSpacing(resources.getDimensionPixelSize(R.dimen.jd));
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.jc);
            this.f89233b.setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, 0);
        }
        a aVar = new a();
        this.f89237f = aVar;
        this.f89233b.setAdapter((ListAdapter) aVar);
    }
}
