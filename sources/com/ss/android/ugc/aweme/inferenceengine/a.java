package com.ss.android.ugc.aweme.inferenceengine;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ml.f;
import com.ss.android.ml.k;
import com.ss.android.ml.process.bl.MLConfigModel;
import com.ss.android.ml.t;
import com.ss.bytenn.API;
import com.ss.bytenn.ByteNNConfig;
import com.ss.bytenn.Tensor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    private API f104504a;

    static {
        Covode.recordClassIndex(66924);
    }

    @Override // com.ss.android.ml.f
    public final boolean a(MappedByteBuffer mappedByteBuffer, MLConfigModel mLConfigModel) {
        API api = new API();
        this.f104504a = api;
        API.a CreateEngine = api.CreateEngine();
        if (CreateEngine != API.a.NO_ERROR) {
            t.a(new RuntimeException("byteNN create engine failed with code ".concat(String.valueOf(CreateEngine))));
            return false;
        }
        ByteNNConfig byteNNConfig = new ByteNNConfig();
        try {
            ByteNNConfig.a aVar = ByteNNConfig.a.CPU;
            if (TextUtils.equals(mLConfigModel.bytenn_forward_type, "auto")) {
                aVar = ByteNNConfig.a.Auto;
            }
            byteNNConfig.init(aVar, mappedByteBuffer, null, "", "");
            if (mLConfigModel.num_threads == 2) {
                byteNNConfig.setThreadNum(mLConfigModel.num_threads);
            } else {
                byteNNConfig.setThreadNum(1);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        API.a InitEngine = this.f104504a.InitEngine(byteNNConfig);
        if (InitEngine != API.a.NO_ERROR) {
            t.a(new RuntimeException("byteNN init engine failed with code ".concat(String.valueOf(InitEngine))));
        }
        if (InitEngine == API.a.NO_ERROR) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ml.f
    public final void a(ByteBuffer byteBuffer, float[][] fArr) {
        if (this.f104504a != null) {
            ArrayList<Tensor> arrayList = new ArrayList<>();
            API.a GetEngineInputConfig = this.f104504a.GetEngineInputConfig(arrayList);
            if (GetEngineInputConfig != API.a.NO_ERROR) {
                t.a(new RuntimeException("byteNN get engine input failed with code ".concat(String.valueOf(GetEngineInputConfig))));
                return;
            }
            try {
                arrayList.get(0).setData(byteBuffer);
                this.f104504a.SetEngineInputs(arrayList);
                this.f104504a.Inference();
                ArrayList<Tensor> arrayList2 = new ArrayList<>();
                API.a GetEngineOutputs = this.f104504a.GetEngineOutputs(arrayList2);
                if (GetEngineOutputs != API.a.NO_ERROR) {
                    t.a(new RuntimeException("byteNN inference get output failed with code ".concat(String.valueOf(GetEngineOutputs))));
                    return;
                }
                ByteBuffer data = arrayList2.get(0).getData();
                data.order(ByteOrder.nativeOrder());
                int i2 = 0;
                while (data.hasRemaining()) {
                    float f2 = data.getFloat();
                    if (i2 < fArr[0].length) {
                        fArr[0][i2] = f2;
                    }
                    i2++;
                }
            } catch (Exception e2) {
                k.a("ml#evaluator", "inference error: ", e2);
                t.a(e2);
            }
        }
    }
}
