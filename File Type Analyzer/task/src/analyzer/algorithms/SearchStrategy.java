package analyzer.algorithms;

import analyzer.tools.InputParameters;

public interface SearchStrategy {
    boolean applyAlgorithm(byte[] text, String pattern);
}
