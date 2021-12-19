package com.ss.android.ugc.aweme.kids.choosemusic.i;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.kids.a.a.c;
import com.ss.android.ugc.aweme.kids.choosemusic.b.b;
import com.ss.android.ugc.aweme.kids.choosemusic.h.k;
import com.ss.android.ugc.aweme.kids.choosemusic.h.l;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.List;

public final class i extends com.ss.android.ugc.aweme.arch.widgets.a {

    /* renamed from: b  reason: collision with root package name */
    TextView f105768b;

    /* renamed from: c  reason: collision with root package name */
    TextView f105769c;

    /* renamed from: d  reason: collision with root package name */
    public ViewPager f105770d;

    /* renamed from: e  reason: collision with root package name */
    View f105771e;

    /* renamed from: f  reason: collision with root package name */
    public k f105772f;

    /* renamed from: g  reason: collision with root package name */
    c<b> f105773g;

    /* renamed from: h  reason: collision with root package name */
    public int f105774h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f105775i;

    /* renamed from: j  reason: collision with root package name */
    public com.ss.android.ugc.aweme.kids.choosemusic.a f105776j;

    /* renamed from: k  reason: collision with root package name */
    a f105777k;

    /* renamed from: l  reason: collision with root package name */
    public int f105778l;

    /* renamed from: m  reason: collision with root package name */
    public int f105779m;
    public boolean n;
    private ViewPager.e o;

    static {
        Covode.recordClassIndex(67715);
    }

    public final void a() {
        this.f105771e.setVisibility(0);
    }

    public final void b() {
        this.f105771e.setVisibility(4);
    }

    class a extends PagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public List<MusicModel> f105780a = null;

        /* renamed from: b  reason: collision with root package name */
        LinkedList<l> f105781b = new LinkedList<>();

        static {
            Covode.recordClassIndex(67716);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getItemPosition(Object obj) {
            return -2;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            List<MusicModel> list = this.f105780a;
            int i2 = 0;
            if (list == null) {
                return 0;
            }
            int size = list.size() / 3;
            if (this.f105780a.size() % 3 != 0) {
                i2 = 1;
            }
            return size + i2;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a() {
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final Object instantiateItem(ViewGroup viewGroup, int i2) {
            boolean z;
            MethodCollector.i(11005);
            l poll = this.f105781b.poll();
            if (poll == null) {
                poll = new l(viewGroup.getContext(), i.this.f105779m);
            }
            k kVar = i.this.f105772f;
            c<b> cVar = i.this.f105773g;
            poll.f105718b = kVar;
            poll.f105719c = cVar;
            if (!poll.f105717a.isEmpty()) {
                int i3 = 0;
                do {
                    poll.f105717a.get(i3).a(poll.f105718b, poll.f105719c);
                    i3++;
                } while (i3 < 3);
            }
            List<MusicModel> list = this.f105780a;
            int i4 = i2 * 3;
            int i5 = i.this.f105774h;
            int i6 = i.this.f105775i;
            com.ss.android.ugc.aweme.kids.choosemusic.a aVar = i.this.f105776j;
            boolean z2 = i.this.n;
            if (list != null) {
                int min = Math.min(i4 + 3, list.size());
                int i7 = i4;
                while (i7 < min) {
                    MusicModel musicModel = list.get(i7);
                    o oVar = poll.getMusicItemViews().get(i7 - i4);
                    oVar.itemView.setVisibility(0);
                    if (i5 == i7) {
                        z = true;
                    } else {
                        z = false;
                    }
                    oVar.a(musicModel, z2, z, i6, i7, aVar);
                    i7++;
                    z2 = z2;
                }
                for (int i8 = min - i4; i8 < 3; i8++) {
                    poll.getMusicItemViews().get(i8).itemView.setVisibility(8);
                }
            }
            viewGroup.addView(poll);
            MethodCollector.o(11005);
            return poll;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
            MethodCollector.i(11007);
            viewGroup.removeView((View) obj);
            this.f105781b.offer(obj);
            MethodCollector.o(11007);
        }
    }

    public final void a(ViewPager.e eVar) {
        ViewPager viewPager;
        if (!(this.f105773g == null || (viewPager = this.f105770d) == null)) {
            viewPager.removeOnPageChangeListener(this.o);
        }
        this.o = eVar;
    }

    public final void a(k kVar, c<b> cVar) {
        this.f105772f = kVar;
        this.f105773g = cVar;
    }

    public i(View view, int i2) {
        super(view);
        this.f105768b = (TextView) view.findViewById(R.id.f9p);
        this.f105769c = (TextView) view.findViewById(R.id.f9n);
        this.f105770d = (ViewPager) view.findViewById(R.id.fkr);
        this.f105771e = view.findViewById(R.id.an5);
        this.f105778l = (int) n.b(d.a(), 84.0f);
        a aVar = new a();
        this.f105777k = aVar;
        this.f105770d.setAdapter(aVar);
        this.f105779m = i2;
        this.f105768b.setOnClickListener(new j(this));
        TextView textView = this.f105768b;
        if (textView instanceof TuxTextView) {
            ((TuxTextView) textView).setTuxFont(62);
        }
    }

    public final void a(int i2, int i3, boolean[] zArr, boolean[] zArr2) {
        for (int i4 = 0; i4 < zArr2.length; i4++) {
            if (this.f105770d.getTop() + (this.f105778l * i4) > i3 || this.f105770d.getTop() + ((i4 + 1) * this.f105778l) < i2) {
                zArr[i4] = false;
                zArr2[i4] = false;
            } else if (!zArr[i4]) {
                zArr[i4] = true;
                zArr2[i4] = true;
            }
        }
    }

    public final void a(com.ss.android.ugc.aweme.kids.a.e.d dVar, List<MusicModel> list, int i2, int i3, int i4, com.ss.android.ugc.aweme.kids.choosemusic.a aVar, boolean z) {
        this.f105769c.setText(dVar.f105309b);
        if (list != null) {
            this.f105770d.getLayoutParams().height = this.f105778l * Math.min(3, list.size());
        }
        this.n = z;
        this.f105775i = i4;
        this.f105774h = i3;
        this.f105777k.f105780a = list;
        this.f105777k.notifyDataSetChanged();
        this.f105770d.setCurrentItem(i2);
        this.f105770d.addOnPageChangeListener(this.o);
        this.f105776j = aVar;
    }
}
