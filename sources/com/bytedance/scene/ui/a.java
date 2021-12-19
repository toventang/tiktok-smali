package com.bytedance.scene.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.group.b;
import com.bytedance.scene.group.f;
import com.bytedance.scene.j;

public abstract class a extends PagerAdapter {

    /* renamed from: a  reason: collision with root package name */
    private b f43046a;

    /* renamed from: b  reason: collision with root package name */
    private f f43047b;

    static {
        Covode.recordClassIndex(26383);
    }

    public abstract f a(int i2);

    public a(b bVar) {
        this.f43046a = bVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        if (((j) obj).n == view) {
            return true;
        }
        return false;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        int id = viewGroup.getId();
        if (id != -1) {
            String concat = "android:switcher:".concat(String.valueOf((long) i2));
            ViewPager viewPager = (ViewPager) viewGroup;
            f fVar = (f) this.f43046a.a(concat);
            if (fVar != null) {
                a(viewPager, fVar, i2);
                this.f43046a.e(fVar);
                return fVar;
            }
            f a2 = a(i2);
            a(viewPager, a2, i2);
            this.f43046a.a(id, a2, concat);
            return a2;
        }
        throw new IllegalArgumentException("ViewPager should have view id before use ScenePageAdapter");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        this.f43046a.c((j) obj);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        super.setPrimaryItem(viewGroup, i2, obj);
        f fVar = (f) obj;
        f fVar2 = this.f43047b;
        if (fVar != fVar2) {
            if (fVar2 != null) {
                fVar2.a(false);
            }
            if (fVar != null) {
                fVar.a(true);
            }
            this.f43047b = fVar;
        }
    }

    private void a(ViewPager viewPager, f fVar, int i2) {
        if (this.f43047b == null && viewPager.getCurrentItem() == i2) {
            this.f43047b = fVar;
        }
        if (fVar == this.f43047b) {
            if (fVar.f42883c) {
                fVar.a(false);
            }
            fVar.a(true);
        } else if (fVar.f42883c) {
            fVar.a(false);
        }
    }
}
