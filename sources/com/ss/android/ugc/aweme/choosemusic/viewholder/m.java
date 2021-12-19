package com.ss.android.ugc.aweme.choosemusic.viewholder;

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
import com.ss.android.ugc.aweme.choosemusic.b;
import com.ss.android.ugc.aweme.choosemusic.b.c;
import com.ss.android.ugc.aweme.choosemusic.view.s;
import com.ss.android.ugc.aweme.choosemusic.view.t;
import com.ss.android.ugc.aweme.music.b.k;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import java.util.List;

public final class m extends com.ss.android.ugc.aweme.arch.widgets.a {

    /* renamed from: b  reason: collision with root package name */
    TuxTextView f70916b;

    /* renamed from: c  reason: collision with root package name */
    TextView f70917c;

    /* renamed from: d  reason: collision with root package name */
    public ViewPager f70918d;

    /* renamed from: e  reason: collision with root package name */
    View f70919e;

    /* renamed from: f  reason: collision with root package name */
    public s f70920f;

    /* renamed from: g  reason: collision with root package name */
    k<c> f70921g;

    /* renamed from: h  reason: collision with root package name */
    public int f70922h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f70923i;

    /* renamed from: j  reason: collision with root package name */
    public b f70924j;

    /* renamed from: k  reason: collision with root package name */
    a f70925k;

    /* renamed from: l  reason: collision with root package name */
    public int f70926l;

    /* renamed from: m  reason: collision with root package name */
    public int f70927m;
    public boolean n;
    private ViewPager.e o;

    static {
        Covode.recordClassIndex(43685);
    }

    public final void a() {
        this.f70919e.setVisibility(0);
    }

    public final void b() {
        this.f70919e.setVisibility(4);
    }

    class a extends PagerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public List<MusicModel> f70928a = null;

        /* renamed from: b  reason: collision with root package name */
        LinkedList<t> f70929b = new LinkedList<>();

        static {
            Covode.recordClassIndex(43686);
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
            List<MusicModel> list = this.f70928a;
            int i2 = 0;
            if (list == null) {
                return 0;
            }
            int size = list.size() / 3;
            if (this.f70928a.size() % 3 != 0) {
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
            MethodCollector.i(5646);
            t poll = this.f70929b.poll();
            if (poll == null) {
                poll = new t(viewGroup.getContext(), m.this.f70927m);
            }
            s sVar = m.this.f70920f;
            k<c> kVar = m.this.f70921g;
            poll.f70867b = sVar;
            poll.f70868c = kVar;
            if (!poll.f70866a.isEmpty()) {
                int i3 = 0;
                do {
                    poll.f70866a.get(i3).a(poll.f70867b, poll.f70868c);
                    i3++;
                } while (i3 < 3);
            }
            List<MusicModel> list = this.f70928a;
            int i4 = i2 * 3;
            int i5 = m.this.f70922h;
            int i6 = m.this.f70923i;
            b bVar = m.this.f70924j;
            boolean z2 = m.this.n;
            if (list != null) {
                int min = Math.min(i4 + 3, list.size());
                int i7 = i4;
                while (i7 < min) {
                    MusicModel musicModel = list.get(i7);
                    s sVar2 = poll.getMusicItemViews().get(i7 - i4);
                    sVar2.itemView.setVisibility(0);
                    if (i5 == i7) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sVar2.a(musicModel, z2, false, z, i6, i7, bVar);
                    i7++;
                    z2 = z2;
                }
                for (int i8 = min - i4; i8 < 3; i8++) {
                    poll.getMusicItemViews().get(i8).itemView.setVisibility(8);
                }
            }
            viewGroup.addView(poll);
            MethodCollector.o(5646);
            return poll;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
            MethodCollector.i(5647);
            viewGroup.removeView((View) obj);
            this.f70929b.offer(obj);
            MethodCollector.o(5647);
        }
    }

    public final void a(ViewPager.e eVar) {
        ViewPager viewPager;
        if (!(this.f70921g == null || (viewPager = this.f70918d) == null)) {
            viewPager.removeOnPageChangeListener(this.o);
        }
        this.o = eVar;
    }

    public final void a(s sVar, k<c> kVar) {
        this.f70920f = sVar;
        this.f70921g = kVar;
    }

    public m(View view, int i2) {
        super(view);
        this.f70916b = (TuxTextView) view.findViewById(R.id.f9p);
        this.f70917c = (TextView) view.findViewById(R.id.f9n);
        this.f70918d = (ViewPager) view.findViewById(R.id.fkr);
        this.f70919e = view.findViewById(R.id.an5);
        this.f70926l = (int) n.b(d.a(), 84.0f);
        a aVar = new a();
        this.f70925k = aVar;
        this.f70918d.setAdapter(aVar);
        this.f70927m = i2;
        this.f70916b.setOnClickListener(new n(this));
        this.f70916b.setTuxFont(62);
    }

    public final void a(int i2, int i3, boolean[] zArr, boolean[] zArr2) {
        for (int i4 = 0; i4 < zArr2.length; i4++) {
            if (this.f70918d.getTop() + (this.f70926l * i4) > i3 || this.f70918d.getTop() + ((i4 + 1) * this.f70926l) < i2) {
                zArr[i4] = false;
                zArr2[i4] = false;
            } else if (!zArr[i4]) {
                zArr[i4] = true;
                zArr2[i4] = true;
            }
        }
    }

    public final void a(MusicCollectionItem musicCollectionItem, List<MusicModel> list, int i2, int i3, int i4, b bVar, boolean z) {
        this.f70917c.setText(musicCollectionItem.mcName);
        if (list != null) {
            this.f70918d.getLayoutParams().height = this.f70926l * Math.min(3, list.size());
        }
        this.n = z;
        this.f70923i = i4;
        this.f70922h = i3;
        this.f70925k.f70928a = list;
        this.f70925k.notifyDataSetChanged();
        this.f70918d.setCurrentItem(i2);
        this.f70918d.addOnPageChangeListener(this.o);
        this.f70924j = bVar;
    }
}
