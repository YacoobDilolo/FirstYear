"""
>>> import timeutil
>>> timeutil.validate("1200 am")
False
>>> timeutil.validate("012:00 pm")
False
>>> timeutil.validate("11:59 wm")
False
>>> timeutil.validate("12:re am")
False
>>> timeutil.validate("12:59 pm")
True

"""
import doctest
doctest.testmod(verbose=True)