package com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel;

import android.content.Context;
import com.airbnb.epoxy.AsyncEpoxyController;
import com.airbnb.epoxy.n;
import com.airbnb.epoxy.s;
import com.airbnb.epoxy.u;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.emoji.emojichoose.p;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifsearch.giphy.a.b;
import h.a.z;
import h.f.b.l;
import java.util.Iterator;
import java.util.List;

public final class GifController extends AsyncEpoxyController {
    private final Context context;
    private List<b> data = z.INSTANCE;
    private final p inputBridge;
    private final GiphyViewModel viewModel;

    static {
        Covode.recordClassIndex(64429);
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<b> getData() {
        return this.data;
    }

    public final p getInputBridge() {
        return this.inputBridge;
    }

    public final GiphyViewModel getViewModel() {
        return this.viewModel;
    }

    @Override // com.airbnb.epoxy.n
    public final void buildModels() {
        Iterator<T> it = this.data.iterator();
        while (it.hasNext()) {
            new c(it.next(), this.context, this.inputBridge, this.viewModel).a((n) this);
        }
    }

    public final void setData(List<b> list) {
        l.d(list, "");
        this.data = list;
        requestDelayedModelBuild(100);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifController(Context context2, p pVar, GiphyViewModel giphyViewModel) {
        super(true);
        l.d(context2, "");
        l.d(pVar, "");
        l.d(giphyViewModel, "");
        this.context = context2;
        this.inputBridge = pVar;
        this.viewModel = giphyViewModel;
    }

    @Override // com.airbnb.epoxy.n
    public final void onModelBound(u uVar, s<?> sVar, int i2, s<?> sVar2) {
        l.d(uVar, "");
        l.d(sVar, "");
        if (h.a.n.a((List) this.data) - i2 <= 5) {
            this.viewModel.a(false);
        }
    }
}
