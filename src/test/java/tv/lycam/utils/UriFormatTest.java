package tv.lycam.utils;

import org.junit.Test;
import tv.lycam.enumeration.Order;
import tv.lycam.enumeration.Sort;
import tv.lycam.model.PageModel;

/**
 * Created by lycamandroid on 17/1/22.
 */
public class UriFormatTest {

    @Test
    public void TestUri() {
        PageModel pageModel = new PageModel();
        pageModel.setOrder(Order.ASC);
        pageModel.setResultsPerPage(12);
        pageModel.setSort(Sort.DESCRIPTION);


        System.out.print(QueryUtil.format(pageModel).toString());
    }

}
