#!/bin/bash
for args in $@
do
   python retest.py $args
done