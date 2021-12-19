package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.u;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.h.e;
import androidx.core.h.v;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    private o.a mActionMenuPresenterCallback;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private ae mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private a mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    private h.a mMenuBuilderCallback;
    private ActionMenuView mMenuView;
    private final ActionMenuView.e mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    c mOnMenuItemClickListener;
    private ActionMenuPresenter mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private int mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private int mTitleTextColor;
    private TextView mTitleTextView;
    private am mWrapper;

    public interface c {
        static {
            Covode.recordClassIndex(441);
        }

        boolean onMenuItemClick(MenuItem menuItem);
    }

    static {
        Covode.recordClassIndex(433);
    }

    /* access modifiers changed from: package-private */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    /* access modifiers changed from: package-private */
    public Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.b();
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            /* class androidx.appcompat.widget.Toolbar.SavedState.AnonymousClass1 */

            static {
                Covode.recordClassIndex(438);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i2) {
                return new SavedState[i2];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };

        /* renamed from: a  reason: collision with root package name */
        int f1447a;

        /* renamed from: b  reason: collision with root package name */
        boolean f1448b;

        static {
            Covode.recordClassIndex(437);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f1447a);
            parcel.writeInt(this.f1448b ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            boolean z;
            this.f1447a = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f1448b = z;
        }
    }

    public static class b extends a.C0018a {

        /* renamed from: b  reason: collision with root package name */
        int f1452b;

        static {
            Covode.recordClassIndex(440);
        }

        public b() {
            this.f895a = 8388627;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public b(a.C0018a aVar) {
            super(aVar);
        }

        public b(b bVar) {
            super((a.C0018a) bVar);
            this.f1452b = bVar.f1452b;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new ae();
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
    }

    private MenuInflater getMenuInflater() {
        return new g(getContext());
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    public void collapseActionView() {
        j jVar;
        a aVar = this.mExpandedMenuPresenter;
        if (aVar != null && (jVar = aVar.f1450b) != null) {
            jVar.collapseActionView();
        }
    }

    /* access modifiers changed from: protected */
    public b generateDefaultLayoutParams() {
        return new b();
    }

    public int getContentInsetEnd() {
        ae aeVar = this.mContentInsets;
        if (aeVar == null) {
            return 0;
        }
        if (aeVar.f1503g) {
            return aeVar.f1497a;
        }
        return aeVar.f1498b;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.mContentInsetEndWithActions;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        ae aeVar = this.mContentInsets;
        if (aeVar != null) {
            return aeVar.f1497a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        ae aeVar = this.mContentInsets;
        if (aeVar != null) {
            return aeVar.f1498b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        ae aeVar = this.mContentInsets;
        if (aeVar == null) {
            return 0;
        }
        if (aeVar.f1503g) {
            return aeVar.f1498b;
        }
        return aeVar.f1497a;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.mContentInsetStartWithNavigation;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    public v getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new am(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        a aVar = this.mExpandedMenuPresenter;
        if (aVar == null || aVar.f1450b == null) {
            return false;
        }
        return true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
    }

    /* access modifiers changed from: package-private */
    public void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        if (getVisibility() != 0 || (actionMenuView = this.mMenuView) == null || !actionMenuView.f1330b) {
            return false;
        }
        return true;
    }

    public int getCurrentContentInsetLeft() {
        if (v.e(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (v.e(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0));
        }
        return getContentInsetStart();
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || actionMenuView.f1331c == null || !actionMenuView.f1331c.g()) {
            return false;
        }
        return true;
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (!(actionMenuView == null || actionMenuView.f1331c == null)) {
            ActionMenuPresenter actionMenuPresenter = actionMenuView.f1331c;
            if (actionMenuPresenter.p != null || actionMenuPresenter.j()) {
                return true;
            }
        }
        return false;
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || actionMenuView.f1331c == null || !actionMenuView.f1331c.j()) {
            return false;
        }
        return true;
    }

    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            if (layout.getEllipsisCount(i2) > 0) {
                return true;
            }
        }
        return false;
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || actionMenuView.f1331c == null || !actionMenuView.f1331c.e()) {
            return false;
        }
        return true;
    }

    private void ensureMenu() {
        ensureMenuView();
        if (this.mMenuView.f1329a == null) {
            h hVar = (h) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new a();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            hVar.a(this.mExpandedMenuPresenter, this.mPopupContext);
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.a(this.mActionMenuPresenterCallback, this.mMenuBuilderCallback);
            b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f895a = 8388613 | (this.mButtonGravity & 112);
            this.mMenuView.setLayoutParams(generateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new AppCompatImageButton(getContext(), null, R.attr.ajd);
            b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f895a = 8388611 | (this.mButtonGravity & 112);
            this.mNavButtonView.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, R.attr.ajd);
            this.mCollapseButtonView = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            b generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f895a = 8388611 | (this.mButtonGravity & 112);
            generateDefaultLayoutParams.f1452b = 2;
            this.mCollapseButtonView.setLayoutParams(generateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new View.OnClickListener() {
                /* class androidx.appcompat.widget.Toolbar.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(436);
                }

                public final void onClick(View view) {
                    Toolbar.this.collapseActionView();
                }
            });
        }
    }

    public int getCurrentContentInsetEnd() {
        h hVar;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView == null || (hVar = actionMenuView.f1329a) == null || !hVar.hasVisibleItems()) {
            return getContentInsetEnd();
        }
        return Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        a aVar = this.mExpandedMenuPresenter;
        if (!(aVar == null || aVar.f1450b == null)) {
            savedState.f1447a = this.mExpandedMenuPresenter.f1450b.getItemId();
        }
        savedState.f1448b = isOverflowMenuShowing();
        return savedState;
    }

    /* access modifiers changed from: package-private */
    public void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((b) childAt.getLayoutParams()).f1452b == 2 || childAt == this.mMenuView)) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    public void setOnMenuItemClickListener(c cVar) {
        this.mOnMenuItemClickListener = cVar;
    }

    /* access modifiers changed from: package-private */
    public class a implements o {

        /* renamed from: a  reason: collision with root package name */
        h f1449a;

        /* renamed from: b  reason: collision with root package name */
        j f1450b;

        static {
            Covode.recordClassIndex(439);
        }

        @Override // androidx.appcompat.view.menu.o
        public final void a(Parcelable parcelable) {
        }

        @Override // androidx.appcompat.view.menu.o
        public final void a(h hVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.o
        public final void a(o.a aVar) {
        }

        @Override // androidx.appcompat.view.menu.o
        public final boolean a() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.o
        public final boolean a(u uVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.o
        public final int b() {
            return 0;
        }

        @Override // androidx.appcompat.view.menu.o
        public final Parcelable f() {
            return null;
        }

        a() {
        }

        @Override // androidx.appcompat.view.menu.o
        public final void a(boolean z) {
            if (this.f1450b != null) {
                h hVar = this.f1449a;
                if (hVar != null) {
                    int size = hVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        if (this.f1449a.getItem(i2) == this.f1450b) {
                            return;
                        }
                    }
                }
                c(this.f1450b);
            }
        }

        @Override // androidx.appcompat.view.menu.o
        public final boolean c(j jVar) {
            if (Toolbar.this.mExpandedActionView instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) Toolbar.this.mExpandedActionView).b();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.mExpandedActionView);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.mCollapseButtonView);
            Toolbar.this.mExpandedActionView = null;
            Toolbar.this.addChildrenForExpandedActionView();
            this.f1450b = null;
            Toolbar.this.requestLayout();
            jVar.d(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.o
        public final boolean b(j jVar) {
            Toolbar.this.ensureCollapseButtonView();
            ViewParent parent = Toolbar.this.mCollapseButtonView.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = jVar.getActionView();
            this.f1450b = jVar;
            ViewParent parent2 = Toolbar.this.mExpandedActionView.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.mExpandedActionView);
                }
                b generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                generateDefaultLayoutParams.f895a = 8388611 | (Toolbar.this.mButtonGravity & 112);
                generateDefaultLayoutParams.f1452b = 2;
                Toolbar.this.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar4 = Toolbar.this;
                toolbar4.addView(toolbar4.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            jVar.d(true);
            if (Toolbar.this.mExpandedActionView instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) Toolbar.this.mExpandedActionView).a();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.o
        public final void a(Context context, h hVar) {
            j jVar;
            h hVar2 = this.f1449a;
            if (!(hVar2 == null || (jVar = this.f1450b) == null)) {
                hVar2.b(jVar);
            }
            this.f1449a = hVar;
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    public void setCollapsible(boolean z) {
        this.mCollapsible = z;
        requestLayout();
    }

    public void setTitleMarginBottom(int i2) {
        this.mTitleMarginBottom = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.mTitleMarginEnd = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.mTitleMarginStart = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.mTitleMarginTop = i2;
        requestLayout();
    }

    private int getHorizontalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.h.h.a(marginLayoutParams) + androidx.core.h.h.b(marginLayoutParams);
    }

    private int getVerticalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private static boolean isCustomView(View view) {
        if (((b) view.getLayoutParams()).f1452b == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof b)) {
            return false;
        }
        return true;
    }

    public void inflateMenu(int i2) {
        getMenuInflater().inflate(i2, getMenu());
    }

    public void setLogo(int i2) {
        setLogo(androidx.appcompat.a.a.a.b(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        CharSequence charSequence;
        if (i2 != 0) {
            charSequence = getContext().getText(i2);
        } else {
            charSequence = null;
        }
        setNavigationContentDescription(charSequence);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(androidx.appcompat.a.a.a.b(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        this.mSubtitleTextColor = i2;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleTextColor(int i2) {
        this.mTitleTextColor = i2;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(i2);
        }
    }

    private int getChildHorizontalGravity(int i2) {
        int e2 = v.e(this);
        int a2 = e.a(i2, e2) & 7;
        if (a2 == 1 || a2 == 3 || a2 == 5) {
            return a2;
        }
        if (e2 == 1) {
            return 5;
        }
        return 3;
    }

    private int getChildVerticalGravity(int i2) {
        int i3 = i2 & 112;
        if (i3 == 16 || i3 == 48 || i3 == 80) {
            return i3;
        }
        return this.mGravity & 112;
    }

    private boolean isChildOrHidden(View view) {
        if (view.getParent() == this || this.mHiddenViews.contains(view)) {
            return true;
        }
        return false;
    }

    private boolean shouldLayout(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setPopupTheme(int i2) {
        if (this.mPopupTheme != i2) {
            this.mPopupTheme = i2;
            if (i2 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public b generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof b) {
            return new b((b) layoutParams);
        }
        if (layoutParams instanceof a.C0018a) {
            return new b((a.C0018a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.mEatingHover = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        h hVar;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f2667d);
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            hVar = actionMenuView.f1329a;
        } else {
            hVar = null;
        }
        if (!(savedState.f1447a == 0 || this.mExpandedMenuPresenter == null || hVar == null || (findItem = hVar.findItem(savedState.f1447a)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f1448b) {
            postShowOverflowMenu();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.mEatingTouch = true;
                }
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && isChildOrHidden(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && isChildOrHidden(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = Build.VERSION.SDK_INT;
        super.onRtlPropertiesChanged(i2);
        ensureContentInsets();
        ae aeVar = this.mContentInsets;
        boolean z = true;
        if (i2 != 1) {
            z = false;
        }
        if (z != aeVar.f1503g) {
            aeVar.f1503g = z;
            if (!aeVar.f1504h) {
                aeVar.f1497a = aeVar.f1501e;
                aeVar.f1498b = aeVar.f1502f;
            } else if (z) {
                if (aeVar.f1500d != Integer.MIN_VALUE) {
                    i5 = aeVar.f1500d;
                } else {
                    i5 = aeVar.f1501e;
                }
                aeVar.f1497a = i5;
                if (aeVar.f1499c != Integer.MIN_VALUE) {
                    i6 = aeVar.f1499c;
                } else {
                    i6 = aeVar.f1502f;
                }
                aeVar.f1498b = i6;
            } else {
                if (aeVar.f1499c != Integer.MIN_VALUE) {
                    i3 = aeVar.f1499c;
                } else {
                    i3 = aeVar.f1501e;
                }
                aeVar.f1497a = i3;
                if (aeVar.f1500d != Integer.MIN_VALUE) {
                    i4 = aeVar.f1500d;
                } else {
                    i4 = aeVar.f1502f;
                }
                aeVar.f1498b = i4;
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.mSubtitleTextAppearance;
                if (i2 != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i2);
                }
                int i3 = this.mSubtitleTextColor;
                if (i3 != 0) {
                    this.mSubtitleTextView.setTextColor(i3);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        } else {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.mTitleTextAppearance;
                if (i2 != 0) {
                    this.mTitleTextView.setTextAppearance(context, i2);
                }
                int i3 = this.mTitleTextColor;
                if (i3 != 0) {
                    this.mTitleTextView.setTextColor(i3);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        } else {
            TextView textView = this.mTitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.aje);
    }

    public void setContentInsetsAbsolute(int i2, int i3) {
        ensureContentInsets();
        this.mContentInsets.b(i2, i3);
    }

    public void setContentInsetsRelative(int i2, int i3) {
        ensureContentInsets();
        this.mContentInsets.a(i2, i3);
    }

    public void setMenuCallbacks(o.a aVar, h.a aVar2) {
        this.mActionMenuPresenterCallback = aVar;
        this.mMenuBuilderCallback = aVar2;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.a(aVar, aVar2);
        }
    }

    public void setSubtitleTextAppearance(Context context, int i2) {
        this.mSubtitleTextAppearance = i2;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    public void setTitleTextAppearance(Context context, int i2) {
        this.mTitleTextAppearance = i2;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i2);
        }
    }

    private void addSystemView(View view, boolean z) {
        b bVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            bVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            bVar = generateLayoutParams(layoutParams);
        } else {
            bVar = (b) layoutParams;
        }
        bVar.f1452b = 1;
        if (!z || this.mExpandedActionView == null) {
            addView(view, bVar);
            return;
        }
        view.setLayoutParams(bVar);
        this.mHiddenViews.add(view);
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
        int i2 = iArr[0];
        int i3 = iArr[1];
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            View view = list.get(i5);
            b bVar = (b) view.getLayoutParams();
            int i6 = bVar.leftMargin - i2;
            int i7 = bVar.rightMargin - i3;
            int max = Math.max(0, i6);
            int max2 = Math.max(0, i7);
            i2 = Math.max(0, -i6);
            i3 = Math.max(0, -i7);
            i4 += max + view.getMeasuredWidth() + max2;
        }
        return i4;
    }

    private void addCustomViewsWithGravity(List<View> list, int i2) {
        boolean z;
        if (v.e(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int a2 = e.a(i2, v.e(this));
        list.clear();
        if (z) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                b bVar = (b) childAt.getLayoutParams();
                if (bVar.f1452b == 0 && shouldLayout(childAt) && getChildHorizontalGravity(bVar.f895a) == a2) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            b bVar2 = (b) childAt2.getLayoutParams();
            if (bVar2.f1452b == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(bVar2.f895a) == a2) {
                list.add(childAt2);
            }
        }
    }

    private int getChildTop(View view, int i2) {
        int i3;
        b bVar = (b) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 > 0) {
            i3 = (measuredHeight - i2) / 2;
        } else {
            i3 = 0;
        }
        int childVerticalGravity = getChildVerticalGravity(bVar.f895a);
        if (childVerticalGravity == 48) {
            return getPaddingTop() - i3;
        }
        if (childVerticalGravity == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - bVar.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i4 < bVar.topMargin) {
            i4 = bVar.topMargin;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            if (i5 < bVar.bottomMargin) {
                i4 = Math.max(0, i4 - (bVar.bottomMargin - i5));
            }
        }
        return paddingTop + i4;
    }

    public void setMenu(h hVar, ActionMenuPresenter actionMenuPresenter) {
        if (hVar != null || this.mMenuView != null) {
            ensureMenuView();
            h hVar2 = this.mMenuView.f1329a;
            if (hVar2 != hVar) {
                if (hVar2 != null) {
                    hVar2.b(this.mOuterActionMenuPresenter);
                    hVar2.b(this.mExpandedMenuPresenter);
                }
                if (this.mExpandedMenuPresenter == null) {
                    this.mExpandedMenuPresenter = new a();
                }
                actionMenuPresenter.f1317m = true;
                if (hVar != null) {
                    hVar.a(actionMenuPresenter, this.mPopupContext);
                    hVar.a(this.mExpandedMenuPresenter, this.mPopupContext);
                } else {
                    actionMenuPresenter.a(this.mPopupContext, (h) null);
                    this.mExpandedMenuPresenter.a(this.mPopupContext, (h) null);
                    actionMenuPresenter.a(true);
                    this.mExpandedMenuPresenter.a(true);
                }
                this.mMenuView.setPopupTheme(this.mPopupTheme);
                this.mMenuView.setPresenter(actionMenuPresenter);
                this.mOuterActionMenuPresenter = actionMenuPresenter;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.mTempMargins;
        int i10 = 0;
        if (ar.a(this)) {
            c2 = 1;
            c3 = 0;
        } else {
            c2 = 0;
            c3 = 1;
        }
        int i11 = i2;
        int i12 = i3;
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i11, 0, i12, 0, this.mMaxButtonHeight);
            i4 = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            i5 = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            i6 = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i11, 0, i12, 0, this.mMaxButtonHeight);
            i4 = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            i5 = Math.max(i5, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            i6 = View.combineMeasuredStates(i6, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i4) + 0;
        iArr[c2] = Math.max(0, currentContentInsetStart - i4);
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i11, max, i12, 0, this.mMaxButtonHeight);
            i7 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            i5 = Math.max(i5, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            i6 = View.combineMeasuredStates(i6, this.mMenuView.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i7);
        iArr[c3] = Math.max(0, currentContentInsetEnd - i7);
        if (shouldLayout(this.mExpandedActionView)) {
            max2 += measureChildCollapseMargins(this.mExpandedActionView, i11, max2, i12, 0, iArr);
            i5 = Math.max(i5, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            i6 = View.combineMeasuredStates(i6, this.mExpandedActionView.getMeasuredState());
        }
        if (shouldLayout(this.mLogoView)) {
            max2 += measureChildCollapseMargins(this.mLogoView, i11, max2, i12, 0, iArr);
            i5 = Math.max(i5, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            i6 = View.combineMeasuredStates(i6, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((b) childAt.getLayoutParams()).f1452b == 0 && shouldLayout(childAt)) {
                i11 = i11;
                i12 = i12;
                max2 += measureChildCollapseMargins(childAt, i11, max2, i12, 0, iArr);
                i5 = Math.max(i5, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                i6 = View.combineMeasuredStates(i6, childAt.getMeasuredState());
            }
        }
        int i14 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i15 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i11, max2 + i15, i12, i14, iArr);
            i8 = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
            i9 = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            i6 = View.combineMeasuredStates(i6, this.mTitleTextView.getMeasuredState());
        } else {
            i8 = 0;
            i9 = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            i8 = Math.max(i8, measureChildCollapseMargins(this.mSubtitleTextView, i11, max2 + i15, i12, i9 + i14, iArr));
            i9 += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            i6 = View.combineMeasuredStates(i6, this.mSubtitleTextView.getMeasuredState());
        }
        int max3 = Math.max(i5, i9);
        int paddingLeft = max2 + i8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i11, -16777216 & i6);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i12, i6 << 16);
        if (!shouldCollapse()) {
            i10 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuViewItemClickListener = new ActionMenuView.e() {
            /* class androidx.appcompat.widget.Toolbar.AnonymousClass1 */

            static {
                Covode.recordClassIndex(434);
            }

            @Override // androidx.appcompat.widget.ActionMenuView.e
            public final boolean a(MenuItem menuItem) {
                if (Toolbar.this.mOnMenuItemClickListener != null) {
                    return Toolbar.this.mOnMenuItemClickListener.onMenuItemClick(menuItem);
                }
                return false;
            }
        };
        this.mShowOverflowMenuRunnable = new Runnable() {
            /* class androidx.appcompat.widget.Toolbar.AnonymousClass2 */

            static {
                Covode.recordClassIndex(435);
            }

            public final void run() {
                Toolbar.this.showOverflowMenu();
            }
        };
        al a2 = al.a(getContext(), attributeSet, new int[]{16842927, 16843072, R.attr.lv, R.attr.o7, R.attr.o8, R.attr.pl, R.attr.pm, R.attr.pn, R.attr.po, R.attr.pp, R.attr.pq, R.attr.a3r, R.attr.a3s, R.attr.a53, R.attr.a67, R.attr.a68, R.attr.a7l, R.attr.afx, R.attr.afy, R.attr.afz, R.attr.aiy, R.attr.aj1, R.attr.aj2, R.attr.aj3, R.attr.aj4, R.attr.aj5, R.attr.aj6, R.attr.aj8, R.attr.aj9}, i2, 0);
        this.mTitleTextAppearance = a2.g(27, 0);
        this.mSubtitleTextAppearance = a2.g(18, 0);
        this.mGravity = a2.c(0, this.mGravity);
        this.mButtonGravity = a2.c(2, 48);
        int d2 = a2.d(21, 0);
        d2 = a2.f(26) ? a2.d(26, d2) : d2;
        this.mTitleMarginBottom = d2;
        this.mTitleMarginTop = d2;
        this.mTitleMarginEnd = d2;
        this.mTitleMarginStart = d2;
        int d3 = a2.d(24, -1);
        if (d3 >= 0) {
            this.mTitleMarginStart = d3;
        }
        int d4 = a2.d(23, -1);
        if (d4 >= 0) {
            this.mTitleMarginEnd = d4;
        }
        int d5 = a2.d(25, -1);
        if (d5 >= 0) {
            this.mTitleMarginTop = d5;
        }
        int d6 = a2.d(22, -1);
        if (d6 >= 0) {
            this.mTitleMarginBottom = d6;
        }
        this.mMaxButtonHeight = a2.e(13, -1);
        int d7 = a2.d(9, Integer.MIN_VALUE);
        int d8 = a2.d(5, Integer.MIN_VALUE);
        int e2 = a2.e(7, 0);
        int e3 = a2.e(8, 0);
        ensureContentInsets();
        this.mContentInsets.b(e2, e3);
        if (!(d7 == Integer.MIN_VALUE && d8 == Integer.MIN_VALUE)) {
            this.mContentInsets.a(d7, d8);
        }
        this.mContentInsetStartWithNavigation = a2.d(10, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = a2.d(6, Integer.MIN_VALUE);
        this.mCollapseIcon = a2.a(4);
        this.mCollapseDescription = a2.c(3);
        CharSequence c2 = a2.c(20);
        if (!TextUtils.isEmpty(c2)) {
            setTitle(c2);
        }
        CharSequence c3 = a2.c(17);
        if (!TextUtils.isEmpty(c3)) {
            setSubtitle(c3);
        }
        this.mPopupContext = getContext();
        setPopupTheme(a2.g(16, 0));
        Drawable a3 = a2.a(15);
        if (a3 != null) {
            setNavigationIcon(a3);
        }
        CharSequence c4 = a2.c(14);
        if (!TextUtils.isEmpty(c4)) {
            setNavigationContentDescription(c4);
        }
        Drawable a4 = a2.a(11);
        if (a4 != null) {
            setLogo(a4);
        }
        CharSequence c5 = a2.c(12);
        if (!TextUtils.isEmpty(c5)) {
            setLogoDescription(c5);
        }
        if (a2.f(28)) {
            setTitleTextColor(a2.b(28, -1));
        }
        if (a2.f(19)) {
            setSubtitleTextColor(a2.b(19, -1));
        }
        a2.f1549a.recycle();
    }

    public void setTitleMargin(int i2, int i3, int i4, int i5) {
        this.mTitleMarginStart = i2;
        this.mTitleMarginTop = i3;
        this.mTitleMarginEnd = i4;
        this.mTitleMarginBottom = i5;
        requestLayout();
    }

    private int layoutChildLeft(View view, int i2, int[] iArr, int i3) {
        b bVar = (b) view.getLayoutParams();
        int i4 = bVar.leftMargin - iArr[0];
        int max = i2 + Math.max(0, i4);
        iArr[0] = Math.max(0, -i4);
        int childTop = getChildTop(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, childTop, max + measuredWidth, view.getMeasuredHeight() + childTop);
        return max + measuredWidth + bVar.rightMargin;
    }

    private int layoutChildRight(View view, int i2, int[] iArr, int i3) {
        b bVar = (b) view.getLayoutParams();
        int i4 = bVar.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int childTop = getChildTop(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, childTop, max, view.getMeasuredHeight() + childTop);
        return max - (measuredWidth + bVar.leftMargin);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x02b1 A[LOOP:1: B:100:0x02af->B:101:0x02b1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02e1 A[LOOP:2: B:105:0x02df->B:106:0x02e1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01ae A[LOOP:0: B:64:0x01ac->B:65:0x01ae, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
        // Method dump skipped, instructions count: 766
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    private int measureChildCollapseMargins(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i7);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + max + i3, marginLayoutParams.width), getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void measureChildConstrained(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = getChildMeasureSpec(i4, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }
}
