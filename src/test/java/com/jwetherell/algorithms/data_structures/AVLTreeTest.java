package com.jwetherell.algorithms.data_structures;

import com.jwetherell.algorithms.utils.Utils;
import org.junit.Test;

import java.util.Collection;

/**
 * Created by Frank on 3/21/16.
 */
public class AVLTreeTest {

    @Test
    public void testAddValue() throws Exception {
        Utils.TestData data = Utils.generateTestData(1000);

        String bstName = "AVL Tree";
        BinarySearchTree<Integer> bst = new AVLTree<Integer>();
        Collection<Integer> bstCollection = bst.toCollection();

        //Assert.assertTrue(TreeTest.testTree(bst, Integer.class, bstName,
        //        data.unsorted, data.invalid));
        //Assert.assertTrue(JavaCollectionTest.testCollection(bstCollection, Integer.class, bstName,
        //        data.unsorted, data.sorted, data.invalid));
    }

    @Test
    public void testRemoveValue() throws Exception {

    }

    @Test
    public void testValidateNode() throws Exception {

    }

    @Test
    public void testToString() throws Exception {

    }
}