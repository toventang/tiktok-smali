package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

public abstract class PagerAdapter {
    private final DataSetObservable mObservable = new DataSetObservable();
    public DataSetObserver mViewPagerObserver;

    static {
        Covode.recordClassIndex(1714);
    }

    public void finishUpdate(View view) {
    }

    public abstract int getCount();

    public int getItemPosition(Object obj) {
        return -1;
    }

    public CharSequence getPageTitle(int i2) {
        return null;
    }

    public float getPageWidth(int i2) {
        return 1.0f;
    }

    public abstract boolean isViewFromObject(View view, Object obj);

    public void restoreState(Parcelable parcelable, ClassLoader classLoader) {
    }

    public Parcelable saveState() {
        return null;
    }

    public void setPrimaryItem(View view, int i2, Object obj) {
    }

    public void startUpdate(View view) {
    }

    public void notifyDataSetChanged() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.mViewPagerObserver;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.mObservable.notifyChanged();
    }

    public void finishUpdate(ViewGroup viewGroup) {
        finishUpdate((View) viewGroup);
    }

    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.mObservable.registerObserver(dataSetObserver);
    }

    public void setViewPagerObserver(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.mViewPagerObserver = dataSetObserver;
        }
    }

    public void startUpdate(ViewGroup viewGroup) {
        startUpdate((View) viewGroup);
    }

    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.mObservable.unregisterObserver(dataSetObserver);
    }

    public Object instantiateItem(View view, int i2) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    public Object instantiateItem(ViewGroup viewGroup, int i2) {
        return instantiateItem((View) viewGroup, i2);
    }

    public void destroyItem(ViewGroup viewGroup, int i2, Object obj) {
        destroyItem((View) viewGroup, i2, obj);
    }

    public void destroyItem(View view, int i2, Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i2, Object obj) {
        setPrimaryItem((View) viewGroup, i2, obj);
    }
}
