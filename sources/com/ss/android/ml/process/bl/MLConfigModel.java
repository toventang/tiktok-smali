package com.ss.android.ml.process.bl;

import com.bytedance.covode.number.Covode;
import java.util.List;

public class MLConfigModel {
    public String bytenn_forward_type;
    public boolean enable_gpu;
    public boolean enable_nn_api;
    public List<String> feature_list;
    public List<PreOPModel> input;
    public String input_type;
    public List<PreOPModel> intput;
    public String model_type;
    public int num_threads;
    public AfOPModel output;

    static {
        Covode.recordClassIndex(37027);
    }

    public String toString() {
        return "MLConfigModel{model_type='" + this.model_type + '\'' + ", input_type='" + this.input_type + '\'' + ", intput=" + this.intput + ", input=" + this.input + ", output=" + this.output + ", feature_list=" + this.feature_list + ", enable_nn_api=" + this.enable_nn_api + ", enable_gpu=" + this.enable_gpu + ", bytenn_forward_type=" + this.bytenn_forward_type + ", num_threads=" + this.num_threads + '}';
    }
}
