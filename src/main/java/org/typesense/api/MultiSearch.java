package org.typesense.api;

import org.typesense.model.MultiSearchResult;

import java.util.Map;
import java.util.List;

public class MultiSearch {

    private ApiCall apiCall;
    public static final String RESOURCEPATH = "/multi_search";

    public MultiSearch(ApiCall apiCall) {
        this.apiCall = apiCall;
    }

    public MultiSearchResult perform(Map<String , List<Map<String,String>>> multiSearchParameters, Map<String, String> common_params) throws Exception {
        return this.apiCall.post(MultiSearch.RESOURCEPATH, multiSearchParameters, common_params, MultiSearchResult.class);
    }
}
