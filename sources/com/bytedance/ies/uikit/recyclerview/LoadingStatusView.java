package com.bytedance.ies.uikit.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.github.rahatarmanahmed.cpv.CircularProgressView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

public class LoadingStatusView extends FrameLayout {
    private final String TAG;
    private int mStatus;
    List<View> mStatusViews;

    static {
        Covode.recordClassIndex(21221);
    }

    public void showEmpty() {
        setStatus(1);
    }

    public void showError() {
        setStatus(2);
    }

    public void showLoading() {
        setStatus(0);
    }

    public boolean isReset() {
        if (this.mStatus == -1) {
            return true;
        }
        return false;
    }

    public static class Builder {
        Context mContext;
        View mEmptyView;
        View mErrorView;
        View mLoadingView;

        static {
            Covode.recordClassIndex(21222);
        }

        private CircularProgressView createProgressView() {
            MethodCollector.i(14183);
            CircularProgressView circularProgressView = (CircularProgressView) LayoutInflater.from(this.mContext).inflate(R.layout.ak0, (ViewGroup) null);
            MethodCollector.o(14183);
            return circularProgressView;
        }

        public Builder setEmptyView(View view) {
            this.mEmptyView = view;
            return this;
        }

        public Builder setErrorView(View view) {
            this.mErrorView = view;
            return this;
        }

        public Builder setLoadingView(View view) {
            this.mLoadingView = view;
            return this;
        }

        public Builder(Context context) {
            if (context != null) {
                this.mContext = context;
                return;
            }
            throw new IllegalArgumentException("LoadingStatusView.Builder:Context can not be null");
        }

        public Builder setLoadingText(int i2) {
            return setLoadingView(createDefaultView(i2));
        }

        public static Builder createDefaultBuilder(Context context) {
            return new Builder(context).setEmptyText(R.string.cyu).setLoadingText(R.string.cyw).setErrorText(R.string.cyv, null);
        }

        private View createDefaultView(int i2) {
            MethodCollector.i(14182);
            TextView textView = (TextView) LayoutInflater.from(this.mContext).inflate(R.layout.ak1, (ViewGroup) null);
            textView.setText(i2);
            MethodCollector.o(14182);
            return textView;
        }

        public Builder setEmptyText(int i2) {
            MethodCollector.i(14181);
            TextView textView = (TextView) LayoutInflater.from(this.mContext).inflate(R.layout.bjc, (ViewGroup) null);
            textView.setText(i2);
            Builder emptyView = setEmptyView(textView);
            MethodCollector.o(14181);
            return emptyView;
        }

        public Builder setUseProgressBar(int i2) {
            CircularProgressView createProgressView = createProgressView();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.height = i2;
            layoutParams.width = i2;
            layoutParams.gravity = 17;
            createProgressView.setLayoutParams(layoutParams);
            return setLoadingView(createProgressView);
        }

        public Builder setErrorText(int i2, View.OnClickListener onClickListener) {
            View createDefaultView = createDefaultView(i2);
            createDefaultView.setOnClickListener(onClickListener);
            return setErrorView(createDefaultView);
        }
    }

    public void reset() {
        int i2 = this.mStatus;
        if (i2 != -1) {
            this.mStatusViews.get(i2).setVisibility(4);
            this.mStatus = -1;
        }
    }

    public LoadingStatusView(Context context) {
        this(context, null);
    }

    private void setStatus(int i2) {
        int i3 = this.mStatus;
        if (i3 != i2) {
            if (i3 >= 0) {
                this.mStatusViews.get(i3).setVisibility(4);
            }
            if (this.mStatusViews.get(i2) != null) {
                this.mStatusViews.get(i2).setVisibility(0);
                this.mStatus = i2;
            }
        }
    }

    public void setBuilder(Builder builder) {
        MethodCollector.i(12342);
        if (builder == null) {
            builder = Builder.createDefaultBuilder(getContext());
        }
        this.mStatusViews.clear();
        this.mStatusViews.add(builder.mLoadingView);
        this.mStatusViews.add(builder.mEmptyView);
        this.mStatusViews.add(builder.mErrorView);
        removeAllViews();
        for (int i2 = 0; i2 < this.mStatusViews.size(); i2++) {
            View view = this.mStatusViews.get(i2);
            if (view != null) {
                view.setVisibility(4);
                if (view.getParent() != null) {
                    ((ViewGroup) view.getParent()).removeView(view);
                }
                addView(view);
            }
        }
        MethodCollector.o(12342);
    }

    public LoadingStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LoadingStatusView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        MethodCollector.i(12204);
        this.TAG = LoadingStatusView.class.getSimpleName();
        this.mStatusViews = new ArrayList(3);
        this.mStatus = -1;
        setBuilder(null);
        MethodCollector.o(12204);
    }
}
