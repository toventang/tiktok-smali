package com.ss.android.ml.process.bl;

import com.bytedance.covode.number.Covode;
import com.ss.android.ml.process.a;
import java.util.List;

public class AfOPModel implements a {
    public List<String> args;
    public List<String> labels;
    public String op;
    public List<Float> opts;

    static {
        Covode.recordClassIndex(37026);
    }

    @Override // com.ss.android.ml.process.b
    public List<String> getArgs() {
        return this.args;
    }

    @Override // com.ss.android.ml.process.a
    public List<String> getLabels() {
        return this.labels;
    }

    @Override // com.ss.android.ml.process.b
    public List<Float> getOPTs() {
        return this.opts;
    }

    @Override // com.ss.android.ml.process.b
    public String getOperator() {
        return this.op;
    }

    public String toString() {
        return "AfOPModel{labels=" + this.labels + ", op='" + this.op + '\'' + ", args=" + this.args + ", opts=" + this.opts + '}';
    }
}
