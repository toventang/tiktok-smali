package com.ss.android.ugc.aweme.view.b;

import android.util.SparseArray;
import android.view.View;
import android.widget.SeekBar;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.slider.TuxSlider;
import com.ss.android.ugc.aweme.common.x;
import com.ss.android.ugc.aweme.model.d;
import com.ss.android.ugc.aweme.model.l;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorState;
import com.ss.android.ugc.aweme.viewModel.ProfileNaviEditorViewModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

public final class b extends f implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: c  reason: collision with root package name */
    public static final a f144109c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public d f144110a;

    /* renamed from: b  reason: collision with root package name */
    public l f144111b;

    /* renamed from: d  reason: collision with root package name */
    private int f144112d;

    /* renamed from: e  reason: collision with root package name */
    private SparseArray f144113e;

    static {
        Covode.recordClassIndex(94304);
    }

    @Override // com.ss.android.ugc.aweme.view.b.f
    public final int a() {
        return R.layout.app;
    }

    @Override // com.ss.android.ugc.aweme.view.b.f
    public final View a(int i2) {
        if (this.f144113e == null) {
            this.f144113e = new SparseArray();
        }
        View view = (View) this.f144113e.get(i2);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.f144113e.put(i2, findViewById);
        return findViewById;
    }

    @Override // com.ss.android.ugc.aweme.view.b.f
    public final void c() {
        SparseArray sparseArray = this.f144113e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.view.b.f
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        c();
    }

    public final void onStartTrackingTouch(SeekBar seekBar) {
    }

    public final void onStopTrackingTouch(SeekBar seekBar) {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(94305);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.view.b.f
    public final void b() {
        if (this.f144111b != null) {
            d dVar = this.f144110a;
            if (dVar == null) {
                h.f.b.l.b();
            }
            HashMap<String, l> f2 = dVar.f();
            l lVar = this.f144111b;
            if (lVar == null) {
                h.f.b.l.b();
            }
            if (!f2.containsKey(lVar.f110789b)) {
                d dVar2 = this.f144110a;
                if (dVar2 == null) {
                    h.f.b.l.b();
                }
                HashMap<String, l> f3 = dVar2.f();
                l lVar2 = this.f144111b;
                if (lVar2 == null) {
                    h.f.b.l.b();
                }
                l lVar3 = f3.get(lVar2.f110789b);
                if (lVar3 == null) {
                    h.f.b.l.b();
                }
                l lVar4 = lVar3;
                l lVar5 = this.f144111b;
                if (lVar5 == null) {
                    h.f.b.l.b();
                }
                lVar4.f110788a = lVar5.f110793f;
            }
            d dVar3 = this.f144110a;
            if (dVar3 == null) {
                h.f.b.l.b();
            }
            HashMap<String, l> f4 = dVar3.f();
            l lVar6 = this.f144111b;
            if (lVar6 == null) {
                h.f.b.l.b();
            }
            l lVar7 = f4.get(lVar6.f110789b);
            if (lVar7 == null) {
                h.f.b.l.b();
            }
            this.f144112d = lVar7.f110788a;
            TuxSlider tuxSlider = (TuxSlider) a(R.id.da2);
            if (tuxSlider != null) {
                tuxSlider.setOnSeekBarChangeListener(this);
            }
            TuxSlider tuxSlider2 = (TuxSlider) a(R.id.da2);
            if (tuxSlider2 != null) {
                int i2 = this.f144112d;
                l lVar8 = this.f144111b;
                if (lVar8 == null) {
                    h.f.b.l.b();
                }
                float f5 = (float) (i2 - lVar8.f110791d);
                l lVar9 = this.f144111b;
                if (lVar9 == null) {
                    h.f.b.l.b();
                }
                int i3 = lVar9.f110792e;
                l lVar10 = this.f144111b;
                if (lVar10 == null) {
                    h.f.b.l.b();
                }
                tuxSlider2.setProgress((int) ((f5 / ((float) (i3 - lVar10.f110791d))) * 100.0f));
            }
        }
    }

    public final void onProgressChanged(SeekBar seekBar, int i2, boolean z) {
        l lVar = this.f144111b;
        if (lVar != null) {
            float f2 = (float) lVar.f110791d;
            l lVar2 = this.f144111b;
            if (lVar2 == null) {
                h.f.b.l.b();
            }
            int i3 = lVar2.f110792e;
            l lVar3 = this.f144111b;
            if (lVar3 == null) {
                h.f.b.l.b();
            }
            int i4 = (int) (f2 + (((float) ((i3 - lVar3.f110791d) * i2)) / 100.0f));
            l lVar4 = this.f144111b;
            if (lVar4 == null) {
                h.f.b.l.b();
            }
            this.f144112d = i4 - (i4 % lVar4.f110794g);
            ProfileNaviEditorViewModel d2 = d();
            l lVar5 = this.f144111b;
            if (lVar5 == null) {
                h.f.b.l.b();
            }
            String str = lVar5.f110789b;
            int i5 = this.f144112d;
            h.f.b.l.d(str, "");
            x editCategory = ((ProfileNaviEditorState) d2.at_()).getEditCategory();
            if (editCategory != null) {
                editCategory.f76612a.put(str, Integer.valueOf(i5));
                d2.d(new ProfileNaviEditorViewModel.w(d2, i5, str));
            }
        }
    }
}
