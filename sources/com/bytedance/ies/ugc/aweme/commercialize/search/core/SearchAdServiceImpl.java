package com.bytedance.ies.ugc.aweme.commercialize.search.core;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService;
import com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton.SearchAdTransformButton;
import com.bytedance.ies.ugc.aweme.commercialize.search.transformbutton.a;
import com.bytedance.ies.ugc.aweme.rich.ui.RichTagView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;

public final class SearchAdServiceImpl implements ISearchAdService {
    static {
        Covode.recordClassIndex(20816);
    }

    public static ISearchAdService a() {
        MethodCollector.i(7283);
        Object a2 = b.a(ISearchAdService.class, false);
        if (a2 != null) {
            ISearchAdService iSearchAdService = (ISearchAdService) a2;
            MethodCollector.o(7283);
            return iSearchAdService;
        }
        if (b.f145528c == null) {
            synchronized (ISearchAdService.class) {
                try {
                    if (b.f145528c == null) {
                        b.f145528c = new SearchAdServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7283);
                    throw th;
                }
            }
        }
        SearchAdServiceImpl searchAdServiceImpl = (SearchAdServiceImpl) b.f145528c;
        MethodCollector.o(7283);
        return searchAdServiceImpl;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final void b(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final void c(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final void e(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setVisibility(4);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final void d(ViewGroup viewGroup) {
        a aVar;
        if (viewGroup != null && (aVar = (a) viewGroup.findViewById(R.id.d0x)) != null) {
            if (aVar.f34729e != null) {
                aVar.removeCallbacks(aVar.f34729e);
            }
            if (aVar.f34729e == null) {
                aVar.f34729e = new a.RunnableC0784a(aVar);
            }
            aVar.postDelayed(aVar.f34729e, 0);
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final void f(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            a aVar = (a) viewGroup.findViewById(R.id.d0x);
            if (aVar != null) {
                ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = -200;
                aVar.setLayoutParams(marginLayoutParams);
                aVar.a(aVar.f34733i, 0);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            a aVar = (a) viewGroup.findViewById(R.id.d0x);
            if (aVar != null) {
                if (aVar.f34728d != null) {
                    aVar.removeCallbacks(aVar.f34728d);
                }
                if (aVar.f34728d == null) {
                    aVar.f34728d = new a.b(aVar);
                }
                aVar.postDelayed(aVar.f34728d, 0);
            }
        }
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final ViewGroup a(ViewGroup viewGroup, Context context, AwemeRawAd awemeRawAd) {
        if (viewGroup == null) {
            return null;
        }
        viewGroup.setVisibility(8);
        if (awemeRawAd != null && (com.a.a(LayoutInflater.from(context), R.layout.auo, viewGroup, true) instanceof ViewGroup)) {
            return viewGroup;
        }
        return null;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final ViewGroup a(ViewGroup viewGroup, Context context, AwemeRawAd awemeRawAd, View.OnClickListener onClickListener) {
        AwemeSearchAdModel awemeSearchAdModel;
        TextView textView;
        MethodCollector.i(7148);
        ImageView imageView = null;
        if (viewGroup == null) {
            MethodCollector.o(7148);
            return null;
        }
        viewGroup.setVisibility(8);
        if (awemeRawAd == null) {
            MethodCollector.o(7148);
            return null;
        }
        AwemeSearchAdModel searchAdInfo = awemeRawAd.getSearchAdInfo();
        View a2 = com.a.a(LayoutInflater.from(context), R.layout.aup, viewGroup, true);
        if (!(a2 instanceof ViewGroup)) {
            MethodCollector.o(7148);
            return null;
        }
        viewGroup.setVisibility(0);
        if (searchAdInfo != null) {
            SearchAdTransformButton searchAdTransformButton = (SearchAdTransformButton) a2.findViewById(R.id.d0x);
            com.bytedance.ies.ugc.aweme.commercialize.search.a.a.a((RichTagView) a2.findViewById(R.id.gp), awemeRawAd);
            l.d(onClickListener, "");
            if (searchAdTransformButton != null) {
                l.d(onClickListener, "");
                searchAdTransformButton.f34730f = awemeRawAd;
                AwemeRawAd awemeRawAd2 = searchAdTransformButton.f34730f;
                if (awemeRawAd2 != null) {
                    awemeSearchAdModel = awemeRawAd2.getSearchAdInfo();
                } else {
                    awemeSearchAdModel = null;
                }
                searchAdTransformButton.f34731g = awemeSearchAdModel;
                if (!searchAdTransformButton.a()) {
                    searchAdTransformButton.setTransformButtonVisibility$commercialize_search_impl_release(8);
                } else {
                    if (searchAdTransformButton.f34730f != null) {
                        if (!searchAdTransformButton.f34732h) {
                            searchAdTransformButton.f34725a = View.inflate(searchAdTransformButton.getContext(), searchAdTransformButton.getLayoutId$commercialize_search_impl_release(), searchAdTransformButton);
                            View view = searchAdTransformButton.f34725a;
                            if (view != null) {
                                textView = (TextView) view.findViewById(R.id.du6);
                            } else {
                                textView = null;
                            }
                            searchAdTransformButton.f34726b = textView;
                            View view2 = searchAdTransformButton.f34725a;
                            if (view2 != null) {
                                imageView = (ImageView) view2.findViewById(R.id.du5);
                            }
                            searchAdTransformButton.f34727c = imageView;
                            searchAdTransformButton.f34732h = true;
                        }
                        searchAdTransformButton.setTransformButtonVisibility$commercialize_search_impl_release(0);
                        TextView textView2 = searchAdTransformButton.f34726b;
                        if (textView2 != null) {
                            textView2.setText(searchAdTransformButton.getTransformButtonText());
                        }
                        searchAdTransformButton.a(searchAdTransformButton.f34733i, 0);
                        searchAdTransformButton.setAlpha(0.75f);
                    } else {
                        searchAdTransformButton.setTransformButtonVisibility$commercialize_search_impl_release(8);
                    }
                    searchAdTransformButton.setOnClickListener(onClickListener);
                }
            }
        } else {
            com.bytedance.ies.ugc.aweme.commercialize.search.a.a.a((RichTagView) a2.findViewById(R.id.gp), awemeRawAd);
        }
        ViewGroup viewGroup2 = (ViewGroup) a2;
        MethodCollector.o(7148);
        return viewGroup2;
    }

    @Override // com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService
    public final void a(AwemeRawAd awemeRawAd, ViewGroup viewGroup, View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
        String str;
        AwemeSearchAdModel searchAdInfo;
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
            String str2 = null;
            if (viewGroup != null) {
                View findViewById = viewGroup.findViewById(R.id.du1);
                if (findViewById != null) {
                    Drawable background = findViewById.getBackground();
                    if (background != null) {
                        background.setAlpha(128);
                    }
                    findViewById.setOnClickListener(onClickListener2);
                }
                if (viewGroup != null) {
                    TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.du2);
                    TuxTextView tuxTextView2 = (TuxTextView) viewGroup.findViewById(R.id.du4);
                    if (tuxTextView != null) {
                        if (!(awemeRawAd == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null)) {
                            str2 = searchAdInfo.getSearchAdTransformButtonText();
                        }
                        tuxTextView.setText(str2);
                        tuxTextView.setOnClickListener(onClickListener);
                    }
                    if (tuxTextView2 != null) {
                        tuxTextView2.setOnClickListener(onClickListener2);
                    }
                }
            }
        }
        if (awemeRawAd == null || (str = awemeRawAd.getType()) == null) {
            str = "";
        }
        int hashCode = str.hashCode();
        if (hashCode != 96801) {
            if (hashCode == 117588 && str.equals("web")) {
                com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad_bg", "button_show", awemeRawAd).b("refer", "bg_more_button").b();
            }
        } else if (str.equals("app")) {
            com.bytedance.ies.ugc.aweme.rich.a.a.a("result_ad_bg", "button_show", awemeRawAd).b("refer", "bg_download_button").b();
        }
    }
}
